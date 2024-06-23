package com.Rrdesh07.CarPooling.service.request;

import com.Rrdesh07.CarPooling.Models.Request;
import com.Rrdesh07.CarPooling.Models.User;
import com.Rrdesh07.CarPooling.Repository.RequestRepository;
import com.Rrdesh07.CarPooling.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class RequestServiceImpl implements  RequestService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    RequestRepository requestRepository;

    @Override
    public List<Request> getAllRequests(Long userId) {
        Optional<User> userDB=userRepository.findById(userId);
        if(userDB.isPresent()){
            User userData=userDB.get();
            List<Request> requests=userData.getRequests();
            return requests;
        }
        return null;
    }

    @Override
    public Request addRequest(Long userId, Request request) {
        Optional<User> userDB=userRepository.findById(userId);
        if(userDB.isPresent()){
            User userData=userDB.get();
            request.setUserId(userData);
            requestRepository.save(request);
            return request;
        }
        return null;
    }

    @Override
    public Request updateRequest(Long userId, Long requestId, @RequestBody Request request){
        Optional<User> userDB=userRepository.findById(userId);
        if(userDB.isPresent()) {
            User userData = userDB.get();
            Optional<Request> requestDB=requestRepository.findById(requestId);
            Request requestData =requestDB.get();
            requestData.setDate(request.getDate());
            requestData.setSource(request.getSource());
            requestData.setDestination(request.getDestination());
            requestData.setTime(request.getTime());
            requestData.setReqType(request.getReqType());
            requestData.setDate(request.getDate());
            requestData.setSeatsBooked(request.getSeatsBooked());
            requestData.setTotalCost(request.getTotalCost());
            requestData.setUserCost(request.getUserCost());
            requestRepository.save(requestData);
            return requestData;
        }
        return null;
    }

    @Override
    public String deleteRequest(Long requestId) {
        Boolean isRequestExist=requestRepository.existsById(requestId);
        if(isRequestExist){
            requestRepository.deleteById(requestId);
            return"request deleted successfully!!";
        }
        else{
            return "RequestId doesn't exist ";
        }
    }


}

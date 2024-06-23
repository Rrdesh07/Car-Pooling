package com.Rrdesh07.CarPooling.Controller.request;

import com.Rrdesh07.CarPooling.Models.Request;
import com.Rrdesh07.CarPooling.service.request.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/{userId}/requests")
public class RequestController {

    @Autowired
    RequestService requestService;

    @GetMapping
    public List<Request> getAllRequests(@PathVariable Long userId){
        List<Request> requests = requestService.getAllRequests(userId);
        return requests;
    }

    @PostMapping
    public Request addRequest(@PathVariable Long userId,@RequestBody Request request){
        Request requestDB=requestService.addRequest(userId,request);
        return requestDB;
    }

    @PutMapping
    public Request updateRequest(@PathVariable Long userId,@RequestParam Long requestId,@RequestBody Request request){
        Request updatedRequest=requestService.updateRequest(userId,requestId,request);
        return updatedRequest;
    }

    @DeleteMapping
    public String deleteRequest(@RequestParam Long requestId){
        String isDeletedRequest=requestService.deleteRequest(requestId);
        return isDeletedRequest;
    }
}

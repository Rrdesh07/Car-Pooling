package com.Rrdesh07.CarPooling.service.user;

import com.Rrdesh07.CarPooling.Models.User;
import com.Rrdesh07.CarPooling.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
       List<User> users= userRepository.findAll();
       return users;
    }

    @Override
    public User addUser(User user) {
        User userDB=userRepository.save(user);
        return userDB;
    }

    @Override
    public User updateUser(Long userId,User user) {
        Optional<User> userDB=userRepository.findById(userId);
        if(userDB.isPresent()){
            User userData=userDB.get();
            userData.setName(user.getName());
            userData.setEmail(user.getEmail());
            userData.setPhoneNo(user.getPhoneNo());
            userData.setCars(user.getCars());
            userData.setRequests(user.getRequests());
            userRepository.save(userData);
            return userData;
        }
        return null;
    }
}

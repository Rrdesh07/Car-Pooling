package com.Rrdesh07.CarPooling.Controller.user;

import com.Rrdesh07.CarPooling.Models.User;
import com.Rrdesh07.CarPooling.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers(){
        List<User> users=userService.getUsers();
        return users;
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        User userDB=userService.addUser(user);
        return userDB;
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId,@RequestBody User user){
        User updatedUser=userService.updateUser(userId,user);
        return updatedUser;
    }

}

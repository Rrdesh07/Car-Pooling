package com.Rrdesh07.CarPooling.Controller.user;

import com.Rrdesh07.CarPooling.Models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/users")
public class UserController {
    public List<User> getUsers(){
        return null;
    }
}

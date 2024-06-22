package com.Rrdesh07.CarPooling.service.user;

import com.Rrdesh07.CarPooling.Models.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User addUser(@RequestBody User user);
    User updateUser(Long userId,@RequestBody User user);
}

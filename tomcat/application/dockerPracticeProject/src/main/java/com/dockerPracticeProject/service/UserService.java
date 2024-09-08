package com.dockerPracticeProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dockerPracticeProject.mapper.UserMapper;
import com.dockerPracticeProject.model.User;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void saveUser(User user) {
        userMapper.insertUser(user);
    }

    public List<User> getAllUsers() {
        return userMapper.selectAllUsers();
    }
}

package com.dockerPracticeProject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dockerPracticeProject.model.User;

@Mapper
public interface UserMapper {

    void insertUser(User user);

    List<User> selectAllUsers();
}

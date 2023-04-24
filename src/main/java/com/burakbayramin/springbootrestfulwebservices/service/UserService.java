package com.burakbayramin.springbootrestfulwebservices.service;

import com.burakbayramin.springbootrestfulwebservices.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}

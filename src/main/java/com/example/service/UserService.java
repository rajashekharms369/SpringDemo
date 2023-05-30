package com.example.service;

import com.example.dto.UserDTO;

public interface UserService {

     UserDTO register(UserDTO userDTO);

    UserDTO login(String email, String password);

}
package com.example.service;

import com.example.converter.UserConverter;
import com.example.dto.UserDTO;
import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private UserConverter userConverter;

    @Override
    public UserDTO register(UserDTO userDTO) {
        User user = userConverter.convertDTOtoEntity(userDTO);
        userRepo.save(user);
        return userDTO;
    }

    @Override
    public UserDTO login(String email, String password) {

        return null;
    }
}

package com.example.converter;

import com.example.dto.UserDTO;
import com.example.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public User convertDTOtoEntity(UserDTO userDTO){
        User user = new User();
        user.setOwnerEmail(userDTO.getOwnerEmail());
        user.setOwnerName(userDTO.getOwnerName());
        user.setPassword(userDTO.getPassword());
        user.setPhone(userDTO.getPhone());
        return user;
    }

    public UserDTO convertEntityToDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setOwnerEmail(user.getOwnerEmail());
        userDTO.setOwnerName(user.getOwnerName());
        userDTO.setPhone(user.getPhone());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }
}

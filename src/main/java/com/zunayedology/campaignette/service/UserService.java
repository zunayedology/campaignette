package com.zunayedology.campaignette.service;

import com.zunayedology.campaignette.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
}

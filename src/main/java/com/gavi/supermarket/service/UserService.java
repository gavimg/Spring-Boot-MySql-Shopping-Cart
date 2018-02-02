package com.gavi.supermarket.service;

import com.gavi.supermarket.dto.LoginDTO;
import com.gavi.supermarket.dto.UserDTO;
import com.gavi.supermarket.dto.UserResponseDTO;
import com.gavi.supermarket.exceptions.DataNotFoundException;
import com.gavi.supermarket.models.User;
import org.springframework.http.ResponseEntity;

/**
 * Created by Hi on 31-01-2018.
 */
public interface UserService {

    String addUser(UserDTO dto);

    String updateUser(UserDTO dto, Long userId) throws DataNotFoundException;

    UserResponseDTO findByUserId(Long userId);

    UserResponseDTO login(LoginDTO dto) throws DataNotFoundException;

    String deleteUser(Long userId);
}

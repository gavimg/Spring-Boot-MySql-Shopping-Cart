package com.gavi.supermarket.service;

import com.gavi.supermarket.dto.LoginDTO;
import com.gavi.supermarket.models.User;
import org.springframework.http.ResponseEntity;

/**
 * Created by Hi on 31-01-2018.
 */
public interface UserService {

    User addUser(User dto);

    User updateUser(User dto, Long userId);

    User findByUserId(Long userId);

    User login(LoginDTO dto);

    String deleteUser(Long userId);
}

package com.gavi.supermarket.controllers;

import com.gavi.supermarket.dto.LoginDTO;
import com.gavi.supermarket.dto.UserResponseDTO;
import com.gavi.supermarket.exceptions.DataNotFoundException;
import com.gavi.supermarket.exceptions.DuplicateElementException;
import com.gavi.supermarket.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hi on 04-02-2018.
 */
@RestController
@RequestMapping("/login")
@Api("login")
@ApiModel("User Login")
public class LoginController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "User Login", notes = "This api is used login", httpMethod = "POST")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> login(@RequestBody LoginDTO dto) throws DuplicateElementException, DataNotFoundException {
        return new ResponseEntity<UserResponseDTO>(userService.login(dto), HttpStatus.CREATED);
    }
}

package com.gavi.supermarket.controllers;

import com.gavi.supermarket.dto.ProductDTO;
import com.gavi.supermarket.dto.SuccessResponseDTO;
import com.gavi.supermarket.dto.UserDTO;
import com.gavi.supermarket.exceptions.DuplicateElementException;
import com.gavi.supermarket.service.UserCartService;
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
 * Created by Hi on 24-01-2018.
 */
@RestController
@RequestMapping("/users")
@Api("user")
@ApiModel("All User related operations")
public class UserController {


    @Autowired
    private UserService userService;

    @ApiOperation(value = "User Sign Up", notes = "This api is used to sign up user", httpMethod = "POST")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addProduct(@RequestBody UserDTO dto) throws DuplicateElementException {
        return new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(userService.addUser(dto)), HttpStatus.CREATED);
    }

}

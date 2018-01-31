package com.gavi.supermarket.service;

import com.gavi.supermarket.models.UserCart;

import java.util.List;

/**
 * Created by Hi on 31-01-2018.
 */
public interface UserCartService {

    List<UserCart> addItem(List<UserCart> dtos);

    UserCart updateItem(UserCart dto, Long cartId);

    List<UserCart> findAll();

    String deleteById(Long cartId);

}

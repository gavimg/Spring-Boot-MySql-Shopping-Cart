package com.gavi.supermarket.service;

import com.gavi.supermarket.models.Order;

import java.util.List;

/**
 * Created by Hi on 31-01-2018.
 */
public interface OrderService {

    Order placeOrder(Order dto);

    Order findByOrderId(Long orderId);

    List<Order> findByUserId(Long userId);

    Order updateOrder(Order dto, Long orderId);

    String cancelOrder(Long orderId);

}

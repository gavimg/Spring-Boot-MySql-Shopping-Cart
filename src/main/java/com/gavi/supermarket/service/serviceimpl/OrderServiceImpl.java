package com.gavi.supermarket.service.serviceimpl;

import com.gavi.supermarket.models.Order;
import com.gavi.supermarket.service.OrderService;

import java.util.List;

/**
 * Created by Hi on 31-01-2018.
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public Order placeOrder(Order dto) {
        return null;
    }

    @Override
    public Order findByOrderId(Long orderId) {
        return null;
    }

    @Override
    public List<Order> findByUserId(Long userId) {
        return null;
    }

    @Override
    public Order updateOrder(Order dto, Long orderId) {
        return null;
    }

    @Override
    public String cancelOrder(Long orderId) {
        return null;
    }
}

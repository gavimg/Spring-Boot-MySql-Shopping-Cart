package com.gavi.supermarket.service.serviceimpl;

import com.gavi.supermarket.models.ProductOrder;
import com.gavi.supermarket.service.OrderService;

import java.util.List;

/**
 * Created by Hi on 31-01-2018.
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public ProductOrder placeOrder(ProductOrder dto) {
        return null;
    }

    @Override
    public ProductOrder findByOrderId(Long orderId) {
        return null;
    }

    @Override
    public List<ProductOrder> findByUserId(Long userId) {
        return null;
    }

    @Override
    public ProductOrder updateOrder(ProductOrder dto, Long orderId) {
        return null;
    }

    @Override
    public String cancelOrder(Long orderId) {
        return null;
    }
}

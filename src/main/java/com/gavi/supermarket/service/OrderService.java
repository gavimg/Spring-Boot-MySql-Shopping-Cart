package com.gavi.supermarket.service;

import com.gavi.supermarket.models.ProductOrder;

import java.util.List;

/**
 * Created by Hi on 31-01-2018.
 */
public interface OrderService {

    ProductOrder placeOrder(ProductOrder dto);

    ProductOrder findByOrderId(Long orderId);

    List<ProductOrder> findByUserId(Long userId);

    ProductOrder updateOrder(ProductOrder dto, Long orderId);

    String cancelOrder(Long orderId);

}

package com.howard.springbootmall.service;

import com.howard.springbootmall.dto.CreateOrderRequest;
import com.howard.springbootmall.model.Order;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
    Order getOrderById(Integer orderId);
}

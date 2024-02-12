package com.howard.springbootmall.service;

import com.howard.springbootmall.dto.CreateOrderRequest;
import com.howard.springbootmall.dto.OrderQueryParams;
import com.howard.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
    Order getOrderById(Integer orderId);
}

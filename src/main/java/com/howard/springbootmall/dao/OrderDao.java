package com.howard.springbootmall.dao;

import com.howard.springbootmall.dto.OrderQueryParams;
import com.howard.springbootmall.model.Order;
import com.howard.springbootmall.model.OrderItem;

import java.util.Iterator;
import java.util.List;

public interface OrderDao {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsById(Integer orderId);
}

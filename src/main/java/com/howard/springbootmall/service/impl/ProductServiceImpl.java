package com.howard.springbootmall.service.impl;

import com.howard.springbootmall.dao.ProductDao;
import com.howard.springbootmall.dto.ProductRequest;
import com.howard.springbootmall.model.Product;
import com.howard.springbootmall.service.ProductSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductSerivce {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}

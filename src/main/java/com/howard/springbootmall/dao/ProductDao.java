package com.howard.springbootmall.dao;

import com.howard.springbootmall.dto.ProductRequest;
import com.howard.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}

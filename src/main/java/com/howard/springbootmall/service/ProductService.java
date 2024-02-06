package com.howard.springbootmall.service;

import com.howard.springbootmall.dto.ProductRequest;
import com.howard.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}

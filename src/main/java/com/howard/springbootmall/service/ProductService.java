package com.howard.springbootmall.service;

import com.howard.springbootmall.constant.ProductCategory;
import com.howard.springbootmall.dto.ProductRequest;
import com.howard.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}

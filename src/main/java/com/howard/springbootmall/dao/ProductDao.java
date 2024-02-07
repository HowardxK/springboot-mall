package com.howard.springbootmall.dao;

import com.howard.springbootmall.dto.ProductQueryParams;
import com.howard.springbootmall.dto.ProductRequest;
import com.howard.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

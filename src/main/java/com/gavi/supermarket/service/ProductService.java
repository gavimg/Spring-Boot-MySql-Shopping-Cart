package com.gavi.supermarket.service;

import com.gavi.supermarket.models.Product;

import java.util.List;

/**
 * Created by Hi on 31-01-2018.
 */
public interface ProductService {

    Product addProduct(Product dto);

    String uploadProducts(List<Product> products);

    Product findProductById(Long productId);

    List<Product> retrieveProducts();

    Product updateProduct(Long productId);

    String deleteProduct(Long productId);
}

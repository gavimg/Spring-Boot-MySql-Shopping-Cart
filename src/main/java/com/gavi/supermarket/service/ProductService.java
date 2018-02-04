package com.gavi.supermarket.service;

import com.gavi.supermarket.dto.ProductDTO;
import com.gavi.supermarket.exceptions.ConflictException;
import com.gavi.supermarket.exceptions.DataNotFoundException;
import com.gavi.supermarket.models.Product;

import java.util.List;

/**
 * Created by Hi on 31-01-2018.
 */
public interface ProductService {

    String addProduct(ProductDTO dto);

    String uploadProducts(List<ProductDTO> products) throws ConflictException;

    ProductDTO findProductById(Long productId);

    List<ProductDTO> retrieveProducts();

    String updateProduct(ProductDTO dto, Long productId) throws DataNotFoundException;

    String deleteProduct(Long productId) throws DataNotFoundException;
}

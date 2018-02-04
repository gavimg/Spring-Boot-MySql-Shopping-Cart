package com.gavi.supermarket.repositories;

import com.gavi.supermarket.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hi on 31-01-2018.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}

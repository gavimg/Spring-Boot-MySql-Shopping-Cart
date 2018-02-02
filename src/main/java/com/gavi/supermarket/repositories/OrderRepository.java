package com.gavi.supermarket.repositories;

import com.gavi.supermarket.models.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hi on 31-01-2018.
 */
public interface OrderRepository extends JpaRepository<ProductOrder,Long> {
}

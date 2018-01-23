package com.gavi.supermarket.Repositories;

import com.gavi.supermarket.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Hi on 23-01-2018.
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}

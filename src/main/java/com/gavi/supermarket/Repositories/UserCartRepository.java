package com.gavi.supermarket.Repositories;

import com.gavi.supermarket.models.UserCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Hi on 23-01-2018.
 */
@Repository
public interface UserCartRepository extends CrudRepository<UserCart,Long> {
}

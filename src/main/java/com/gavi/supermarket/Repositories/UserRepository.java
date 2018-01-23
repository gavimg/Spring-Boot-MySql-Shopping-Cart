package com.gavi.supermarket.Repositories;

import com.gavi.supermarket.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Hi on 23-01-2018.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}

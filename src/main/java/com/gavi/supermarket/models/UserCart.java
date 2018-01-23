package com.gavi.supermarket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Hi on 23-01-2018.
 */
@Entity
public class UserCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cartId;

    private List<String> productId;

    private String userId;


}

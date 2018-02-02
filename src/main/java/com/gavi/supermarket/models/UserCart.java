package com.gavi.supermarket.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Hi on 23-01-2018.
 */
@Getter
@Setter
@Entity
public class UserCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cartId;

    @ElementCollection
    private List<String> productId;

    private String userId;


}

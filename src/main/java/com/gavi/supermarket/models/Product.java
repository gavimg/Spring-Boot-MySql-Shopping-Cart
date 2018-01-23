package com.gavi.supermarket.models;

import com.gavi.supermarket.enums.Category;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Hi on 23-01-2018.
 */
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    private String productName;
    private String productCost;
    private byte[] productImage;
    private String productDescription;
    private String productSpecification;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Order> orders;
}

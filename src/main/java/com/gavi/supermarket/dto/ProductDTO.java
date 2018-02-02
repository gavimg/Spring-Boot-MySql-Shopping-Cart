package com.gavi.supermarket.dto;

import com.gavi.supermarket.enums.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by Hi on 01-02-2018.
 */
@Getter
@Setter
public class ProductDTO {

    private String productName;
    private String productCost;
    private byte[] productImage;
    private String productDescription;
    private String productSpecification;
    private String category;
    private Long barcode;
}

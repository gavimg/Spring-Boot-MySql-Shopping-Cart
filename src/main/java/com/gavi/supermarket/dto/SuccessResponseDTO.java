package com.gavi.supermarket.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Hi on 02-02-2018.
 */

public class SuccessResponseDTO {

    private String message;

    public SuccessResponseDTO(String message) {
        this.message = message;
    }
}

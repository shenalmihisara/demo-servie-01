package com.abc.crm.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {

    private String name;
    private String description;
    private Double price;
    private boolean isActive;

}

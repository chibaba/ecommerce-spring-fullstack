package com.nedstack.springbootecommerce.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="product_category ")

//@Data -- known bug

@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue
    private Long id;

    private String categoryName;

    private Set<Product> products;
}

package ru.vlad.enterprise.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseEntity{
    private String name;
    private String barcode;
    private String description;
    private int price;

    public Product(String name, String barcode, String description, int price) {
        this.name = name;
        this.barcode = barcode;
        this.description = description;
        this.price = price;
    }

    public Product(String name) {
        super();
        this.name = name;
    }

    public Product() {
        super();
    }
}

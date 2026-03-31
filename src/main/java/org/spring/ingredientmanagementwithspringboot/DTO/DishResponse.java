package org.spring.ingredientmanagementwithspringboot.DTO;

import lombok.Getter;

@Getter
public class DishResponse {
    private int id;
    private String name;
    private String dishType;
    private double price;

    public DishResponse(int id, String name, String dishType, double price) {
        this.id = id;
        this.name = name;
        this.dishType = dishType;
        this.price = price;
    }

}
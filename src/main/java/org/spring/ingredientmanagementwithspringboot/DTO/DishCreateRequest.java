package org.spring.ingredientmanagementwithspringboot.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.spring.ingredientmanagementwithspringboot.entity.DishTypeEnum;

@AllArgsConstructor
@Setter
@Getter
public class DishCreateRequest {

    private String name;
    private DishTypeEnum dishType;
    private Double price;


}
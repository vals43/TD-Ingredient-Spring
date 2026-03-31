package org.spring.ingredientmanagementwithspringboot.repository;

import org.spring.ingredientmanagementwithspringboot.entity.Dish;
import org.spring.ingredientmanagementwithspringboot.entity.DishIngredient;

import java.util.List;

public interface DishRepository {
    Dish findOne(int id);
    List<DishIngredient> findIngredientsByDishId(int id);
    boolean checkIfExist(int id);
    List<Dish> findAllWithFilter(Double priceUnder, Double priceOver, String name);
    Dish saveDish(Dish dish);
    boolean existsByName(String name);
}

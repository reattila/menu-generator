package org.own.parser.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DishesDto {
    private String name;
    private List<IngredientsDto> ingredientsDtoList = new ArrayList<>();
}

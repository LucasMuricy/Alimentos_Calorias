package com.example.alimentos.business;

import com.example.alimentos.Entity.FoodEntity;
import com.example.alimentos.reposity.FoodRepository;

import java.util.List;

public class FoodBusiness {

    public List<FoodEntity> getList() {
        return new FoodRepository().getList();
    }
}

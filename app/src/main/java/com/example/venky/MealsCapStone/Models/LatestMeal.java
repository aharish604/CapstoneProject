package com.example.venky.MealsCapStone.Models;

import android.os.Parcel;

import java.util.List;

/**
 * Created by VENKY on 08/04/2019.
 */

public class LatestMeal {
    private List<MealInfo> meals;

    public void setMeals(List<MealInfo> meals) {
        this.meals = meals;
    }

    public LatestMeal(List<MealInfo> meals) {
        this.meals = meals;
    }

    protected LatestMeal(Parcel in) {
    }

    public LatestMeal() {

    }


    public List<MealInfo> getMeals() {
        return meals;
    }

}


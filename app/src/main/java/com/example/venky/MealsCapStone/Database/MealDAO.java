package com.example.venky.MealsCapStone.Database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.venky.MealsCapStone.Models.MealInfo;

import java.util.List;

/**
 * Created by VENKY on 08/04/2019.
 */


@Dao
public interface MealDAO {
    @Query("SELECT * FROM meal_table")
    LiveData<List<MealInfo>> getAllFavs();

    @Query("SELECT * FROM meal_table WHERE idMeal = :id")
    public boolean isCheckFav(String id);

    @Insert
    public void addToFavs(MealInfo entity);

    @Delete
    public void delFromFav(MealInfo entity);
}


package com.example.venky.MealsCapStone.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.venky.MealsCapStone.Models.MealInfo;

/**
 * Created by VENKY on 08/04/2019.
 */
@Database(entities = {MealInfo.class},version = 1,exportSchema = false)
public abstract class MealRoomDatabase extends RoomDatabase {
    private static final String DATABASE = "meals_database";
    public abstract MealDAO mealDAO();

    private static volatile MealRoomDatabase INSTANCE;

    static MealRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (MealRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            MealRoomDatabase.class, DATABASE)
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;

    }
}


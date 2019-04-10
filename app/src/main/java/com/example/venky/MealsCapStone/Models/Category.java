package com.example.venky.MealsCapStone.Models;

/**
 * Created by VENKY on 08/04/2019.
 */

public class Category {

    String idCategory;
    String strCategory;
    String strCategoryThumb;
    String strCategoryDescription;

    public Category(String idCategory, String strCategory,
                    String strCategoryThumb, String strCategoryDescription) {
        this.idCategory = idCategory;
        this.strCategory = strCategory;
        this.strCategoryThumb = strCategoryThumb;
        this.strCategoryDescription = strCategoryDescription;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrCategoryThumb() {
        return strCategoryThumb;
    }

    public String getStrCategoryDescription() {
        return strCategoryDescription;
    }
}

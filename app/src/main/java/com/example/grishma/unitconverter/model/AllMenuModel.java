package com.example.grishma.unitconverter.model;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.support.annotation.DrawableRes;

/**
 * Created by grishma on 2/23/16.
 */
public class AllMenuModel {
    private String name;
    private @DrawableRes int path;

    public AllMenuModel (String name, @DrawableRes int path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }
}

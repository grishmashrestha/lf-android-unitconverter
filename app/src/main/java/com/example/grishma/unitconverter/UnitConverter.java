package com.example.grishma.unitconverter;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by grishma on 2/23/16.
 */
public class UnitConverter extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}

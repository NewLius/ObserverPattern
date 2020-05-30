package com.example.observer;

import android.util.Log;

public class ObserverImpl implements Observer {

    private final String TAG = "ObserverImpl";
    private String name;

    public ObserverImpl(String name){
        this.name = name;
    }

    @Override
    public void update() {
        Log.v(TAG,"update notify："+name);
    }
}

package com.example.hilttest;

import android.util.Log;

import javax.inject.Inject;

public class Network {
    @Inject
    public Network() {
    }
    public  void print()
    {
        Log.e("msg","hello from Network");

    }
}

package com.example.hilttest;

import android.util.Log;

import javax.inject.Inject;

public class Database {
    @Inject
    public Database() {
    }

    public  void print()
    {
        Log.e("msg","hello from database");
    }
}

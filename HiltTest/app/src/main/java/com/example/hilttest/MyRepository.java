package com.example.hilttest;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;


public class MyRepository {
    Network network;
    Database database;

    @Inject
    public MyRepository(Network network,Database database) {
        this.network=network;
        this.database=database;
    }

    public  void print()
    {
        Log.e("msg","hello from repo");
        network.print();
        database.print();
    }
}

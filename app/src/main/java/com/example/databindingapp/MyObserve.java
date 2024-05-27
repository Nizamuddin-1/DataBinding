package com.example.databindingapp;

import androidx.databinding.BaseObservable;

public class MyObserve extends BaseObservable {
    String name;
    String email;
    public MyObserve(String name,String email)
    {
        this.email=email;
        this.name=name;
    }
}

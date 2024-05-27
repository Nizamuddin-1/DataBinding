package com.example.databindingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    MyClickHandler myClickHandler;
    MyObserve myObserve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        person p1=new person("Jack","jack@gmail.com");
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setPerson(p1);
        myClickHandler=new MyClickHandler(this);
        activityMainBinding.setOnclickedhandler(myClickHandler);
        myObserve =new MyObserve("Nizamuddin","abc@gmail.com");
        activityMainBinding.setPerson( myObserve);
    }
}
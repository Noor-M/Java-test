package com.example.android.javainheritance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //sportCar s = new sportCar();
        Invertebrates invertebrates = new Invertebrates();
        
        //the dog is too old
        invertebrates.setAge(30);
        invertebrates.setName("dog");
        invertebrates.getAge();
        invertebrates.getName();

    }
}

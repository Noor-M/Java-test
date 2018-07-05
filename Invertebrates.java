package com.example.android.javainheritance;

import android.util.Log;


public class Invertebrates extends Animal {
    String name;
    @Override
    public int getAge() {
        Log.i("Invertebrates", "getAge: "+super.getAge());
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        Log.i("Invertebrates", "getName: "+name);
        return name;
    }
}

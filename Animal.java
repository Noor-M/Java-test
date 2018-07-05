package com.example.android.javainheritance;

public class Animal {
    String food;
    int legs;
    int age;
    public Animal()
    {
        super();
    }
    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String typeAnimal(String type)
    {
        return type;
    }
    public String typeAnimal(String type , String classification)
    {
        String types = type + classification;
        return types;
    }
}

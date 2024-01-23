package com.company;

public class Cat implements IPet{
    private String myName;
    public Cat(String name){
        this.myName = name;
    }

    @Override
    public String getName() {
        return myName;
    }

    @Override
    public void eat() {
        System.out.println(myName + " is eating fish..");
    }

    @Override
    public void sleep() {
        System.out.println(myName + " is sleeping..");
    }

    @Override
    public void exercise() {
        System.out.println(myName + " is walking..");
    }
}

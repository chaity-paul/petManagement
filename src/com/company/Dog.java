package com.company;

public class Dog implements IPet{
    private String myName;
    public Dog(String name){
        this.myName = name;
    }

    @Override
    public String getName() {
        return myName;
    }

    @Override
    public void eat() {
        System.out.println(myName + " is eating bone..");
    }

    @Override
    public void sleep() {
        System.out.println(myName + " is sleeping..");
    }

    @Override
    public void exercise() {
        System.out.println(myName + " is running..");
    }
}

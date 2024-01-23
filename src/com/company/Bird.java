package com.company;

public class Bird implements IPet{
    private String myName;
    public Bird(String name){
        this.myName = name;
    }

    @Override
    public String getName() {
        return myName;
    }

    @Override
    public void eat() {
        System.out.println(myName + " is eating rice..");
    }

    @Override
    public void sleep() {
        System.out.println(myName + " is sleeping..");
    }

    @Override
    public void exercise() {
        System.out.println(myName + " is flying..");
    }
}

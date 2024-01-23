package com.company;

import java.util.ArrayList;
import java.util.List;

public class PetManagement {
    private List<IPet> myPets;
    public PetManagement(){
        myPets = new ArrayList<>();
    }

    void add(IPet pet){
        myPets.add(pet);
        System.out.println(pet.getName() + " is added..");
    }

    void remove(IPet pet){
        myPets.remove(pet);
        System.out.println(pet.getName() + " is removed..");
    }

    void showPet(){

    }

    void giveMeal(){
        System.out.println("meal is given..");
        for(IPet pet: myPets){
            pet.eat();
        }
    }

    void giveExercise(){
        System.out.println("Pets are exercising..");
        for(IPet pet: myPets){
            pet.exercise();
        }
    }

    void giveSleep(){
        System.out.println("Pets are sleeping..");
        for(IPet pet: myPets){
            pet.sleep();
        }
    }

}

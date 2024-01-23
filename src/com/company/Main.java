package com.company;

public class Main {

    public static void main(String[] args) {
        PetManagement pm = new PetManagement();
        Dog dog = new Dog("Tommy");
        Cat cat = new Cat("Mini");
        Bird bird = new Bird("Tia");

        pm.add(dog);
        pm.add(cat);
        pm.add(bird);
        pm.giveSleep();
        pm.giveMeal();
        pm.remove(dog);
    }
}

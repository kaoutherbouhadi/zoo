package com.example.zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) throws InvalidAgeException, ZooFullException {

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);
        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal tigre = new Animal("Félins", "Tigre", 4, true);
        Animal chatNegatif = new Animal("Félins", "Chat", -2, true);
        Animal singe = new Animal("Primates", "Singe", 6, true);
        Animal chat= new Animal("Primates", "chat", 6, true);


        Penguin p1 = new Penguin("Bird", "Pingu", 5, false, "Ice", 30);
        Penguin p2 = new Penguin("Bird", "Lolo", 3, false, "Ice", 50);
        Dolphin d1 = new Dolphin("Mammal", "Delfy", 8, true, "Ocean", 40);

        Aquatic poisson = new Aquatic("Fish", "Requin", 4, false, "Ocean", 200);
        Terrestrial elephant = new Terrestrial("Mammifère", "Éléphant", 10, true);
poisson.eatMeat(Food.MEAT);
elephant.eatPlantAndMeet(Food.MEAT);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(d1);


        try {
            myZoo.addAnimal(lion);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + myZoo.getAnimalCount());

        try {
            myZoo.addAnimal(tigre);
        }  catch (InvalidAgeException | ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + myZoo.getAnimalCount());

        try {
            myZoo.addAnimal(chatNegatif);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("nb d'animaux : " + myZoo.getAnimalCount());

        try {
            myZoo.addAnimal(singe);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("nb d'animaux : " + myZoo.getAnimalCount());
        try {
            myZoo.addAnimal(chat);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("nb d'animaux : " + myZoo.getAnimalCount());
        myZoo.displayZoo();
        int index= myZoo.searchAnimal(lion);
        System.out.println(index);
        System.out.println(myZoo);
        System.out.println(lion);
        myZoo.displaySwim();
        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        boolean exists = false;
        for (int i = 0; i < myZoo.aquaticCount; i++) {
            if (myZoo.aquaticAnimals[i].equals(p2)) {
                exists = true;
                break;
            }
        }
        System.out.println("p2 existe déjà dans le zoo ? " + exists);






    }
}

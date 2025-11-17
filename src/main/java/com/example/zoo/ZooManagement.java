package com.example.zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);
        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal tigre = new Animal("Félins", "Tigre", 4, true);

        Penguin p1 = new Penguin("Bird", "Pingu", 5, false, "Ice", 30);
        Penguin p2 = new Penguin("Bird", "Lolo", 3, false, "Ice", 50);
        Dolphin d1 = new Dolphin("Mammal", "Delfy", 8, true, "Ocean", 40);

        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(d1);


        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);
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

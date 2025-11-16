package com.example.zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);
        Animal lion = new Animal("Félins", "Lion", 5, true);

        Animal tigre = new Animal("Félins", "Tigre", 4, true);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);

        myZoo.displayZoo();
int index= myZoo.searchAnimal(lion);
System.out.println(index);
        System.out.println(myZoo);
        System.out.println(lion);

        Aquatic aquatic = new Aquatic();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        Terrestrial terrestrial = new Terrestrial();

        System.out.println(aquatic);
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(terrestrial);

        // Appel de la méthode swim (Instruction 24)
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}

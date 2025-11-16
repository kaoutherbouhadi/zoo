package com.example.zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);
        Animal lion = new Animal("Félins", "Lion", 5, true);

        Animal tigre = new Animal("Félins", "Tigre", 4, true);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(lion);
    }
}

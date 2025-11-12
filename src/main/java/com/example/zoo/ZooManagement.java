package com.example.zoo;

import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Entrez le nom du zoo : ");
            zoo.zooName = scanner.nextLine().trim();
            if (zoo.zooName.isEmpty()) {
                System.out.println("Le nom du zoo ne peut pas être vide !");
            }
        } while (zoo.zooName.isEmpty());


        do {
            System.out.print("Entrez le nombre de cages : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez entrer un entier positif !");
                scanner.next();
            }
            zoo.nbrCages = scanner.nextInt();
            if (zoo.nbrCages <= 0) {
                System.out.println("Le nombre de cages doit être positif !");
            }
        } while (zoo.nbrCages <= 0);

        scanner.close();


        System.out.println("Le zoo \"" + zoo.zooName + "\" a maintenant " + zoo.nbrCages + " cages.");
    }

}
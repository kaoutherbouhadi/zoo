package com.example.zoo;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }


    public void displayZoo() {
        System.out.println("Zoo name : " + name);
        System.out.println("City : " + city);
        System.out.println("Number of cages : " + nbrCages);
    }

    public String toString() {
        return "Zoo { name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + " }";
    }
}

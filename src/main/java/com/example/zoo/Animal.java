package com.example.zoo;
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {
        if (age < 0) {
            System.out.println("Erreur : l'âge ne peut pas être négatif. Age mis à 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
        this.family = family;
        this.name = name;
        this.isMammal = isMammal;
    }


    public String toString() {
        return "Animal { family=" + family + ", name=" + name +
                ", age=" + age + ", isMammal=" + isMammal + " }";
    }
}

package com.example.zoo;
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {

            this.age = age;

        this.family = family;
        this.name = name;
        this.isMammal = isMammal;
    }

    public Animal() {
        this.family = "Unknown";
        this.name = "Unknown";
        this.age = 0;
        this.isMammal = false;
    }


    public String toString() {
        return "Animal { family=" + family + ", name=" + name +
                ", age=" + age + ", isMammal=" + isMammal + " }";
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}

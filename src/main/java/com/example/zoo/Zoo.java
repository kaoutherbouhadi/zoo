package com.example.zoo;

import java.lang.reflect.Array;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
   Aquatic[] aquaticAnimals = new Aquatic[10];
    private final int nbrCages=3;
    private int animalCount = 0;
    int aquaticCount = 0;
    int nbDolphin = 0;
    int nbPenguin = 0;


    public Zoo(String name, String city, int nbrCages) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du zoo ne peut pas être vide !");
            this.name = "ZooSansNom";
        } else {
            this.name = name;
        }

        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public int getAquaticCount() {
        return aquaticCount;
    }

    public void setAquaticCount(int aquaticCount) {
        this.aquaticCount = aquaticCount;
    }

    public int getNbDolphin() {
        return nbDolphin;
    }

    public void setNbDolphin(int nbDolphin) {
        this.nbDolphin = nbDolphin;
    }

    public int getNbPenguin() {
        return nbPenguin;
    }

    public void setNbPenguin(int nbPenguin) {
        this.nbPenguin = nbPenguin;
    }

    public void displayZoo() {
        System.out.println("Zoo name : " + name);
        System.out.println("City : " + city);
        System.out.println("nb de cages : " + nbrCages);
    }
    public void displayAnimal(){
        for (int i=0; i <animalCount;i++){
        System.out.println("nom de l'animal:"+ animals[i]);}
    }
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {


        if (animal.getAge() < 0) {
            throw new InvalidAgeException("age négatif : " + animal.getName());
        }

        if (animalCount >= nbrCages) {
            throw new ZooFullException("zoo plein  : " + animal.getName());
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("l'animal existe deja : " + animal.getName());
            return;
        }

        animals[animalCount] = animal;
        animalCount++;
        System.out.println(animal.getName() + " ajout avec succes");
    }


   /* public boolean addAnimalUnique(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false;
        }
        return addAnimal(animal);
    }*/
    boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal);
        if (index==-1) return false;
        else {
            for (int i=index; i<animalCount-1;i++)
            {
                animals[i]=animals[i+1];
            }
         animals[animalCount-1]=null;
            animalCount--;
        }return  true;
    }
    int searchAnimal(Animal animal){
        for (int i=0;i<animalCount; i++)
        {
            if (animals[i].name.equals(animal.name))
            {
                return i;
            }

        }
        return -1;
    }
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }
    Zoo comparerZoo(Zoo z1, Zoo z2){
            if(z1.animalCount<z2.animalCount) return z1;
            else return z2;
    }
    public void addAquaticAnimal(Aquatic aquatic){
        if(aquaticCount<aquaticAnimals.length)
        {
            aquaticAnimals[aquaticCount]=aquatic;
            aquaticCount++;
        }
        else {
            System.out.println("tableau est plein");
        }
    }
    public void displaySwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
            System.out.println("this aquatic animal is swimming.");
        }
    }
    public float maxPenguinSwimmingDepth(){
        float max = 0;
for (int i=0; i< aquaticCount; i++)
{
    if(aquaticAnimals[i] instanceof Penguin){
        float depth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
    if (depth > max) max = depth;}}
        return max;
    }
    public void displayNumberOfAquaticsByType(){

        for (int i=0; i<aquaticCount; i++)
        {
            if(aquaticAnimals[i] instanceof Dolphin){
                nbDolphin ++;
            }
            else {
                nbPenguin ++;
            }
        }

        System.out.println("nombre de dolphins: " + nbDolphin);
        System.out.println("nombre de penguins: " + nbPenguin);
    }
    public String toString() {
        return "Zoo { name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + " }";
    }
}

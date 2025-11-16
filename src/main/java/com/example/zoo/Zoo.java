package com.example.zoo;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    private final int nbrCages=25;
    private int animalCount = 0;


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



    public void displayZoo() {
        System.out.println("Zoo name : " + name);
        System.out.println("City : " + city);
        System.out.println("Number of cages : " + nbrCages);
    }
    public void displayAnimal(){
        for (int i=0; i <animalCount;i++){
        System.out.println("nom de l'animal:"+ animals[i]);}
    }
    boolean addAnimal(Animal animal){
        if (isZooFull())
        {
            System.out.println("le zoo est plein");
            return false;
        }
if(searchAnimal(animal)==-1)
{
  System.out.println("l'animaux existe deja");
  return false;
}

animals[animalCount]=animal;
animalCount++;
return true;
    }
    public boolean addAnimalUnique(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false;
        }
        return addAnimal(animal);
    }
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
    public String toString() {
        return "Zoo { name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + " }";
    }
}

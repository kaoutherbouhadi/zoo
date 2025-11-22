package com.example.zoo;

class Aquatic extends Animal implements  Carnivore<Food>{
    protected String habitat;

    public Aquatic() {
        super();
        this.habitat = "Unknown";
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = (habitat == null || habitat.isEmpty()) ? "Unknown" : habitat;
    }

    public Aquatic(String fish, String requin, int i, boolean b, String ocean, int i1) {
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }


    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Aquatic)) return false;

        Aquatic other = (Aquatic) obj;
        return this.name.equals(other.name) &&
                this.age == other.age &&
                this.habitat.equals(other.habitat);

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void  eatMeat(Food food){
        if(food== Food.MEAT)
        {
            System.out.println(this.getName()+ "eat meat");
        }
        else {
            System.out.println("ne peut pas manger des plantes");
        }
    }}

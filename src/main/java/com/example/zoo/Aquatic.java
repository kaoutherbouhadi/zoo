package com.example.zoo;

class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
        super();
        this.habitat = "Unknown";
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = (habitat == null || habitat.isEmpty()) ? "Unknown" : habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }

    // Instruction 24
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}

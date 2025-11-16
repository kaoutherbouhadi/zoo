package com.example.zoo;

class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {
        super();
        this.nbrLegs = 4;
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = (nbrLegs < 0) ? 0 : nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
}

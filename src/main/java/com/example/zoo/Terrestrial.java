package com.example.zoo;

class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;

    public Terrestrial() {
        super();
        this.nbrLegs = 4;
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = (nbrLegs < 0) ? 0 : nbrLegs;
    }

    public Terrestrial(String mammifère, String éléphant, int i, boolean b) {
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    public void  eatPlantAndMeet(Food food){
        if (food == Food.BOTH) {
            System.out.println(getName() + " mange aviandes et plantes.");
        } else {
            System.out.println(getName() + "  mange âs les deux.");
        }
    }

    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println(getName() + " mange de la viande.");
        } else {
            System.out.println(getName() + "  manger  des plantes.");
        }
    }


    public void eatPlant(Food food) {
        if (food == Food.PLANT || food == Food.BOTH) {
            System.out.println(getName() + " mange des plantes.");
        } else {
            System.out.println(getName() + "  mange de la viande.");
        }
    }


}

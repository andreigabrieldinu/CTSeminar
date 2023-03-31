package factoryMethod;

import factoryMethod.PersonalSpital;

public class Brancardier implements PersonalSpital {

    private String nume;

    protected Brancardier(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void descriere() {
        System.out.println("Numele brancardierului este " + this.getNume());
    }
}
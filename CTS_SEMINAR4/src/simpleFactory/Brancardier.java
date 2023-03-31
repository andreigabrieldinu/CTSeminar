package simpleFactory;

public class Brancardier implements PersonalSpital {

    private String nume;

    protected Brancardier(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void desciere() {
        System.out.println("Numele brancardierului este " + this.getNume());
    }
}

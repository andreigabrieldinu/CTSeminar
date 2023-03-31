package factoryMethod;

public class Medic implements PersonalSpital {

    private String nume;

    protected Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }


    @Override
    public void descriere() {
        System.out.println("Numele medicului este " + this.getNume());
    }
}

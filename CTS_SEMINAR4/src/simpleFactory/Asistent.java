package simpleFactory;

public class Asistent implements PersonalSpital{
    private String nume;

    protected Asistent(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void desciere() {
        System.out.println("Numele asistentului este " + this.getNume());
    }
}

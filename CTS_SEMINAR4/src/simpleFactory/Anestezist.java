package simpleFactory;

public class Anestezist implements PersonalSpital{

    private String nume;
    private int numarPacienti;

    protected Anestezist(String nume, int numarPacienti) {
        this.nume = nume;
        this.numarPacienti = numarPacienti;
    }

    @Override
    public void desciere() {
        System.out.println("Numele anestezistului " + this.nume + " are " + this.numarPacienti + " pacienti.");
    }
}

package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private Integer clasa;
	private String tutore;
	private static Integer sumaFinantare=30;
	
	public Integer getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte  + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, Integer varsta, Integer punctaj,
			Integer nr_proiecte, String[] denumireProiect, Integer clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public void afisareFinantare() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste "+Elev.sumaFinantare+" Euro/zi in proiect.");
	}
	
}

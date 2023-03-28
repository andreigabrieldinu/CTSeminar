package cts.s02.principii_clean_code.clase;

import java.util.Scanner;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected Integer varsta;
	protected Integer punctaj;
	protected Integer nrProiecte;
	protected String[] denumireProiect;
	protected static Integer pragAcceptat=80;
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public Integer getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatus(){
			System.out.println("Aplicantul "+this.nume+" "+this.prenume+ (punctaj>pragAcceptat ? " " : " nu ") + "a fost acceptat.");
		
	}
	public Integer getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public Aplicant() {
		super();
	}
	public Aplicant(String nume, String prenume, Integer varsta, Integer punctaj, Integer nrProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
	}
	public Integer getNrProiecte() {
		return nrProiecte;
	}
	public void setNrProiecte(int nrProiecte) {
		this.nrProiecte = nrProiecte;
	}
	public abstract void afisareFinantare();
	public void setPunctaj(Integer punctaj) {
		this.punctaj=punctaj;
	}
	
}

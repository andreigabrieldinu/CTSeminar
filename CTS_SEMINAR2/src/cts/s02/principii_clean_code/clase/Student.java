package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected Integer an_studii;
	private static Integer sumaFinantare=20;
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public Integer getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, Integer varsta, Integer punctaj, Integer nr_proiecte, String[] denumireProiect, String facultate, Integer an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte +  ", DenumireProiect=" + Arrays.toString(denumireProiect) + "Facultate=" + facultate + ", An_studii=" + an_studii ;
	}
	
	
	public void  afisareFinantare() {
		System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste "+Student.sumaFinantare+" Euro/zi in proiect.");
	}
	
}

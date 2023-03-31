package classes;

import interfaces.BuilderPacient;
import interfaces.BuilderPacientV2;
import interfaces.IBuilder;
import interfaces.Pacient;

public class Main {

	public static void main(String[] args) {
		IBuilder builderPacient=new BuilderPacient("Costin");
		Pacient pacient1;
		Pacient pacient2;
		pacient1= builderPacient.setHalatInterior(true).build();
		pacient2= builderPacient.setHalatInterior(true).setMicDejunInclus(true).build();
		System.out.println(pacient1);
		System.out.println(pacient2);
		
		IBuilder builderPacientV2=new BuilderPacientV2();
		Pacient pacient3=builderPacientV2.setNume("Ion").setPatRabatabil(true).setPapuciDeCamera(true).build();
		Pacient pacient4=builderPacientV2.setNume("George").build();
		System.out.println(pacient3);
		System.out.println(pacient4);
	}

}

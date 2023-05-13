package observer.main;

import observer.clase.Banca;
import observer.clase.Client;
import observer.clase.IClient;

public class Main {

	public static void main(String[] args) {
		Banca banca=new Banca("BCR");
		
		IClient client1=new Client("Marcel");
		IClient client2=new Client("George");
		IClient client3=new Client("Gigel");
		IClient client4=new Client("Petru");
		
		banca.aplicatieActualizata();
		
		banca.adaugaObserver(client1);
		
		banca.adaugaCreditNou();
		
		banca.adaugaObserver(client2);
		banca.adaugaObserver(client3);
	
	banca.stergereObserver(client1);
	
	banca.aplicatieActualizata();
	}
	

}

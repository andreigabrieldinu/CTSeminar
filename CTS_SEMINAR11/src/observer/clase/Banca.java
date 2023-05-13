package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca {

	public List<IClient> observari= new ArrayList<IClient>();
	public String numeBanca;
	
	public Banca( String numeBanca) {
		super();
		this.numeBanca = numeBanca;
	}

	@Override
	public void adaugaObserver(IClient client) {
		this.observari.add(client);
	}

	@Override
	public void stergereObserver(IClient client) {
		this.observari.remove(client);
	}

	@Override
	public void notifica(String mesaj) {
		for(IClient observer: observari) {
			observer.afiseazaMesaj(mesaj);
		}
	}
	
	public void adaugaCreditNou() {
		notifica(numeBanca+" a adaugat un nou tip de credit, daca doriti sa il accesati ne puteti contacta pentru detalii");
	}
	
	public void aplicatieActualizata() {
		notifica(numeBanca+" a actualizat aplicatia");
	}
	
	
	

}

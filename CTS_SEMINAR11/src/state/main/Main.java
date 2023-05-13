package state.main;

import state.clase.Bancomat;

public class Main {

	public static void main(String[] args) {
		Bancomat bancomat= new Bancomat(1000);
		
		bancomat.introducerePIN();
		bancomat.retrageCard();
		bancomat.introducerePIN();
		bancomat.retrageBani(200);
		bancomat.introducereCard();
		bancomat.introducerePIN();
		bancomat.retrageBani(500);
		bancomat.retrageCard();
		
	}

}

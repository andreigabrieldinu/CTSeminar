package strategy;

public class VerificareTribuna implements Strategy {

	public void verificaSpectator(Spectator s) {
		System.out.println("Verificarea in tribuna pentru spectatorul "+ s.getNume());
	}
}

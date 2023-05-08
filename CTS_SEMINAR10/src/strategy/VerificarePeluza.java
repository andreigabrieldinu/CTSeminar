package strategy;

public class VerificarePeluza implements Strategy{

	@Override
	public void verificaSpectator(Spectator s) {
		System.out.println("Verificarea in peluza pentru spectatorul "+ s.getNume());
	}
	
}

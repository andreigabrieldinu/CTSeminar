package strategy;

public class VerificareVip implements Strategy{
	public void verificaSpectator(Spectator s) {
		System.out.println("Verificarea la vip pentru spectatorul "+ s.getNume());
	}
}

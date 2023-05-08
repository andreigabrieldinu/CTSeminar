package strategy;

public class Jandarm {
	private Strategy modVerificare;
	private String nume;
	public Jandarm(String nume) {
		super();
		this.nume = nume;
		this.modVerificare=new VerificarePeluza();
	}
	
	public void setModVerificare(Strategy modVerificare) {
		this.modVerificare = modVerificare;
	} 

	public void verificaSpectator(Spectator s) {
		modVerificare.verificaSpectator(s);
	}
}

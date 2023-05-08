package strategy;

public class Main {

	public static void main(String[] args) {
		Jandarm jandarm=new Jandarm("Ion");
		
		Spectator s1=new Spectator("Micsunel");
		Spectator s2=new Spectator("Marius");
		Spectator s3=new Spectator("cristi");
		
		jandarm.verificaSpectator(s1);
		jandarm.setModVerificare(new VerificareVip());
		jandarm.verificaSpectator(s2);
		jandarm.setModVerificare(new VerificareTribuna());
		jandarm.verificaSpectator(s3);
	}

}

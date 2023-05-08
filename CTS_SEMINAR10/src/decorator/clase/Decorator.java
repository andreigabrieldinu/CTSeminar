package decorator.clase;

public abstract class Decorator implements IBilet{

	private IBilet bilet;
	
	public Decorator(IBilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void printareBilet() {
		this.bilet.printareBilet();
	}

	public abstract void printMesajSustinere();

	@Override
	public String getNumeEchipa1() {
		return bilet.getNumeEchipa1();
	}
	
	
}

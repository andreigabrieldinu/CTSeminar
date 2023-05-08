package decorator.clase;

public class DecoratorBilet extends Decorator {

	
	
	public DecoratorBilet(IBilet bilet) {
		super(bilet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printMesajSustinere() {
		System.out.println("Sustinem echipa "+ super.getNumeEchipa1());
	}

}

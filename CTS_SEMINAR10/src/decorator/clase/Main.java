package decorator.clase;

public class Main {

	public static void main(String[] args) {
		IBilet bilet1 = new Bilet("Silviu", "Romania", "Spania");
        IBilet bilet2 = new Bilet("Silivu", "Romania", "Germania");
        IBilet bilet3 = new Bilet("Silviu", "Qatar", "Spania");

        bilet1.printareBilet();
        bilet2.printareBilet();
        bilet3.printareBilet();

        Decorator decoratorBilet1 = new DecoratorBilet(bilet1);
        Decorator decoratorBilet2 = new DecoratorBilet(bilet2);

        decoratorBilet1.printMesajSustinere();
        decoratorBilet2.printMesajSustinere();
        decoratorBilet1.printareBilet();
        decoratorBilet2.printareBilet();
	}

}

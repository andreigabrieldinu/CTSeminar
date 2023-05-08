package flyweight;

public class Main {

	public static void main(String[] args) {
		FabricaSpectatori fabrica=new FabricaSpectatori();
		PozitieDesenare pozitie1= new PozitieDesenare(20, 10, "Rosu");
		PozitieDesenare pozitie2=new PozitieDesenare(10, 30, "Albastru");
		PozitieDesenare pozitie3=new PozitieDesenare(24, 12, "Verde");
		
		fabrica.getSpectator(1, 20, 10).deseneazaSpectator(pozitie3);
		fabrica.getSpectator(2, (float)13.5,(float) 20.4).deseneazaSpectator(pozitie3);
		fabrica.getSpectator(3, 24, 13).deseneazaSpectator(pozitie3);
		fabrica.getSpectator(4, 52, 9).deseneazaSpectator(pozitie3);
		fabrica.getSpectator(5, 20, 10).deseneazaSpectator(pozitie3);
		
	}

}

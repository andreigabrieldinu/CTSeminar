package main;
import model.ZooKeeper;
import model.Zoo;
import model.Lion;
import model.Pisica;
import model.Zebra;

public class Main {

	public static void main(String[] args) {
		ZooKeeper zk=new ZooKeeper("Dinu");
		Zoo zoo=new Zoo("Gradina Zoologica",zk);
		
		Lion l=new Lion("Simba", 5);
		zoo.adaugaAnimal(l);
		zoo.adaugaAnimal(new Lion("Marcel",5));
		zoo.adaugaAnimal(new Zebra("Marty",10));
		
		zoo.adaugaAnimal(new Pisica("Ionel",2));
		
		zoo.feedAllAnimals();
		
	}

}

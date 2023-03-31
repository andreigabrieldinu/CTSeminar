package model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String nume;
	private ZooKeeper zk;
	private List<Animal> list;
	
	public Zoo(String nume, ZooKeeper zk) {
		super();
		this.nume = nume;
		this.zk = zk;
		this.list = new ArrayList<>();
	}

	public void feedAllAnimals() {
		if(list!=null) {
			for(Animal a : list) {
				zk.feedAnimal(a);
			}

		}
	}
	
	public void adaugaAnimal(Animal a) {
		if(a!=null) {
		list.add(a);
		}
	}
}
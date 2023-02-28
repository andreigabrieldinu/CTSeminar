package model;

public abstract class Animal {
	private String name;
	private int varsta;
	
	public Animal(String name, int varsta) {
		super();
		this.name = name;
		this.varsta = varsta;
	}
	
	public abstract void eat(String numeIngrijitor);

	public String getName() {
		return name;
	}
	public int getAge() {
		return varsta;
	}
}

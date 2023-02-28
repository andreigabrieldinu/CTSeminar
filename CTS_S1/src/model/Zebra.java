package model;

public class Zebra extends Animal {

	public Zebra(String name, int varsta) {
		super(name, varsta);
	}

	@Override
	public void eat(String numeIngrijitor) {
		System.out.println("The zebra "+ super.getName()+ " with the age "+super.getAge()+" has been fed by " + numeIngrijitor);
	}
	 
}

package model;

public class Pisica extends Animal {

	public Pisica(String name, int varsta) {
		super(name, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(String numeIngrijitor) {
		System.out.println("The cat "+ super.getName()+ " with the age "+super.getAge()+" has been fed by " + numeIngrijitor);
		
	}
	
}

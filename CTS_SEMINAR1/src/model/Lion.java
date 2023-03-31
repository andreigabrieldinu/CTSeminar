package model;

public class Lion extends Animal {

	
	public Lion(String name, int varsta) {
		super(name, varsta);
	}

	@Override
	public void eat(String numeIngrijitor) {
		System.out.println("The lion "+ super.getName()+ " with the age "+super.getAge()+" has been fed by " + numeIngrijitor);
	}

}

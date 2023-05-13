package template.clase;

public class Bancomat extends BancomatAbstract {

	
	public Bancomat(String adresaBancomat) {
		super(adresaBancomat);
	}

	@Override
	protected void introduceCard() {
		System.out.println("A fost introdus cardul in bancomatul de la "+super.getAdresaBancomat());
	}

	@Override
	protected void introducePin() {
		System.out.println("A fost introdus pinul in bancomatul din "+super.getAdresaBancomat());
	}

	@Override
	protected void specificareSuma(int suma) {
		System.out.println("A fost specficata "+suma+" in bancomatul din " +super.getAdresaBancomat());
		
	}

	@Override
	protected void retrageSuma() {
		System.out.println("A fost solicitata suma din bancomatul din "+super.getAdresaBancomat());
		
	}

	@Override
	protected void retragereCard() {
		System.out.println("A fost retras cardul din bancomatul din "+super.getAdresaBancomat());
		
	}

}

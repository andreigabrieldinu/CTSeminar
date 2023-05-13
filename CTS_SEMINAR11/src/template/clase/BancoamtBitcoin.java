package template.clase;

public class BancoamtBitcoin extends BancomatAbstract{

	public BancoamtBitcoin(String adresaBancomat) {
		super(adresaBancomat);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void introduceCard() {
System.out.println("A fost introdus cardul pentru cardul Bitcoin in bancomatul din"+super.getAdresaBancomat());		
	}

	@Override
	protected void introducePin() {
		System.out.println("A fost introdus pinul pentru cardul Bitcoin in bancomatul din"+super.getAdresaBancomat());		
		
	}

	@Override
	protected void specificareSuma(int suma) {
		System.out.println("A fost specificata "+ suma+" de bitcoin in bancomatul din"+super.getAdresaBancomat());		
	}

	@Override
	protected void retrageSuma() {
		System.out.println("A fost retrasa suma pentru cardul Bitcoin in bancomatul din"+super.getAdresaBancomat());		

		
	}

	@Override
	protected void retragereCard() {
		System.out.println("A fost retras cardul Bitcoin in bancomatul din"+super.getAdresaBancomat());		
		
	}

	
}

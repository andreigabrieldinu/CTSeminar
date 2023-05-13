package template.clase;

public abstract class BancomatAbstract {
	
	private String adresaBancomat;

	
	
	public String getAdresaBancomat() {
		return adresaBancomat;
	}
	public BancomatAbstract(String adresaBancomat) {
		super();
		this.adresaBancomat = adresaBancomat;
	}
	protected abstract void introduceCard();
	protected abstract void introducePin();
	protected abstract void specificareSuma(int suma);
	protected abstract void retrageSuma();
	
	protected abstract void retragereCard();
	
	public final void scoateBaniDeLaBancomat(int suma) {
		introduceCard();
		introducePin();
		specificareSuma(suma);
		retrageSuma();
		retragereCard();
		
	}
	
}

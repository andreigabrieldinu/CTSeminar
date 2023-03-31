package interfaces;

public class Pacient {
	private String nume;
	private boolean patRabatabil;
	private boolean micDejunInclus;
	private boolean papuciDeCamera;
	private boolean halatInterior;
	protected Pacient(String nume, boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera,
			boolean halatInterior) {
		super();
		this.nume = nume;
		this.patRabatabil = patRabatabil;
		this.micDejunInclus = micDejunInclus;
		this.papuciDeCamera = papuciDeCamera;
		this.halatInterior = halatInterior;
	}
	protected void setNume(String nume) {
		this.nume = nume;
	}
	protected void setPatRabatabil(boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}
	protected void setMicDejunInclus(boolean micDejunInclus) {
		this.micDejunInclus = micDejunInclus;
	}
	protected void setPapuciDeCamera(boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}
	protected void setHalatInterior(boolean halatInterior) {
		this.halatInterior = halatInterior;
	}
	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDejunInclus=" + micDejunInclus
				+ ", papuciDeCamera=" + papuciDeCamera + ", halatInterior=" + halatInterior + "]";
	}
	
}

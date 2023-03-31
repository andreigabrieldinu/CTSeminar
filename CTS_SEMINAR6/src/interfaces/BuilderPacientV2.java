package interfaces;

public class BuilderPacientV2 implements IBuilder {
	private String nume;
	private boolean patRabatabil;
	private boolean micDejunInclus;
	private boolean papuciDeCamera;
	private boolean halatInterior;
	
	public BuilderPacientV2() {
		this.nume="Anonim";
		this.patRabatabil=false;
		this.micDejunInclus=false;
		this.papuciDeCamera=false;
		this.halatInterior=false;
	}
	
	public IBuilder setNume(String nume) {
		this.nume=nume;
		return this;
	}
	public IBuilder setPatRabatabil(boolean patRabatabil) {
		this.patRabatabil=patRabatabil;
		return this;
	}
	public IBuilder setMicDejunInclus(boolean micDejunInclus) {
		this.micDejunInclus=micDejunInclus;
		return this;
	}
	public IBuilder setPapuciDeCamera(boolean papuciDeCamera) {
		this.papuciDeCamera=papuciDeCamera;
		return this;
	}
	public IBuilder setHalatInterior(boolean halatInterior) {
		this.halatInterior=halatInterior;
		return this;
	}
	@Override
	public Pacient build() {
		return new Pacient(nume,patRabatabil,micDejunInclus,papuciDeCamera,halatInterior);
	}
	
}

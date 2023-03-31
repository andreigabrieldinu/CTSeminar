package interfaces;

public class BuilderPacient implements IBuilder {
	private Pacient pacient;
	private String nume;
	private boolean patRabatabil;
	private boolean micDejunInclus;
	private boolean papuciDeCamera;
	private boolean halatInterior;
	public BuilderPacient(String nume) {
		this.pacient= new Pacient(nume,false,false,false,false);
	}

	public BuilderPacient setNume(String nume) {
		throw new IllegalArgumentException("Not applicable");
	}
	public BuilderPacient setPatRabatabil(boolean patRabatabil) {
		pacient.setPatRabatabil(patRabatabil);
		return this;
	}
	public BuilderPacient setMicDejunInclus(boolean micDejunInclus) {
		pacient.setMicDejunInclus(micDejunInclus);
		return this;
	}
	public BuilderPacient setPapuciDeCamera(boolean papuciDeCamera) {
		pacient.setPapuciDeCamera(papuciDeCamera);
		return this;
	}
	public BuilderPacient setHalatInterior(boolean halatInterior) {
		pacient.setHalatInterior(halatInterior);
		return this;
	}
	
	
	
	@Override
	public Pacient build() {
		return pacient;
	}
	
	
	
}

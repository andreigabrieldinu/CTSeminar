package interfaces;

public interface IBuilder {
	public Pacient build();
	
	public IBuilder setNume(String nume);
	public IBuilder setPatRabatabil(boolean patRabatabil);
	public IBuilder setMicDejunInclus(boolean micDejunInclus);
	public IBuilder setPapuciDeCamera(boolean papuciDeCamera);
	public IBuilder setHalatInterior(boolean halatInterior);
}

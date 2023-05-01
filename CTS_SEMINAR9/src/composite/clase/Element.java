package composite.clase;

public interface Element {
	public double calculareSumaAsigurare();
	public void adaugaGrup(Element gr);
	public void stergeGrup(Element gr);
	public Element getGrup(int index);
	public void afisareSumaAsigurare();
}

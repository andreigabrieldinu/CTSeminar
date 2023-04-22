package restaurant.adapter.bucatarie;

public class Bucatarie implements ISoftRestaurant {
	private String numeBucatar;
	
	public Bucatarie(String numeBucatar) {
		super();
		this.numeBucatar = numeBucatar;
		
	}
	@Override
	public void printeazaNota(double totalSuma) {
		System.out.println("Nota a emis-o bucatarul " +this.numeBucatar);
		System.out.println(" cu totalul "+ totalSuma);
		
	}
	
	
}

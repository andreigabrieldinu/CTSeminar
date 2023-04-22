package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftRestaurant{
	
	public AdapterRestaurant(String denumire) {
		super(denumire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaNota(double totalPlata) {
		System.out.println("Nota totala este "+totalPlata);
		
	}

}

package manager;

import entitys.Campaing;
import entitys.Game;
import entitys.Player;
import service.SaleService;

public class SaleManager implements SaleService {

	@Override
	public void sell(Game games, Player players, Campaing campaings) {
		double lastPrice = games.getPrice() - (games.getPrice() * campaings.getDiscount() / 100);
		
		System.out.println("Player : " +players.getFirstName() + " " +"\nGame : " +games.getName() + " " + "\nFirst Price : " +games.getPrice() + " "+ "\nCampaing : " +campaings.getCampaingName() + " "+"\nDiscount % : " + campaings.getDiscount() + " " + "\nLast Price : " + lastPrice );
		
		
	}
	

	

}








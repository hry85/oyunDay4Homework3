package entitys;

import java.time.LocalDate;

import manager.PlayerManager;
import manager.SaleManager;
import service.MernisServiceAdapter;
import service.PlayerService;


public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1,"Huray","Erdi",LocalDate.of(1985, 4, 18),"36106827968");
		Game game = new Game (1,"Futboll Manager",39.90);
		Campaing campaing = new Campaing(1,"Black Friday",45);
		
		PlayerService playerService = new PlayerManager(new MernisServiceAdapter());
		playerService.add(player);
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(game, player, campaing);
		

	}

}

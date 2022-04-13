package service;

import entitys.Campaing;
import entitys.Game;
import entitys.Player;

public interface SaleService {
	
	void sell(Game games , Player players , Campaing campaings);

}

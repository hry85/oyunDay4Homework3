package manager;

import entitys.Player;
import service.PlayerCheckService;

public class PlayerCheckManager  implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player players) {
		
		return true;
	}
	
	

}

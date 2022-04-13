package manager;

import entitys.Player;
import service.PlayerCheckService;
import service.PlayerService;

public class PlayerManager implements PlayerService {
	
	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
		
	}

	
	@Override
	public void add(Player player) {
		if(playerCheckService.checkIfRealPerson(player)) {
		
		System.out.println("Player added : " +player.getFirstName());
		
		}else {
			System.out.println("Player is not real person");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Player updated : " +player.getFirstName());
						
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player deleted : " +player.getFirstName());
		
		
	}
		
}

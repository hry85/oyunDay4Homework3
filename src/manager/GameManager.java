package manager;

import entitys.Game;
import service.GameService;

public class GameManager implements GameService {

	@Override
	public void add(Game games) {
		System.out.println("Game added : " +games.getName());
		
		
	}

	@Override
	public void update(Game games) {
		System.out.println("Game updaded : " +games.getName());
	
		
	}

	@Override
	public void delete(Game games) {
		System.out.println("Game deleted : " +games.getName());
		
	}
	
	

}

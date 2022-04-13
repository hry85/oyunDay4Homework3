package manager;

import entitys.Campaing;
import service.CampaingService;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaings) {
		
		System.out.println("Campaing added : "+campaings.getCampaingName());
		
		
	}

	@Override
	public void update(Campaing campaings) {
		System.out.println("Campaing updated : " +campaings.getCampaingName() );
		
	}

	@Override
	public void delete(Campaing campaings) {
		
		System.out.println("Campaing deleted : " +campaings.getCampaingName() );
	
		
	}
	
	

}

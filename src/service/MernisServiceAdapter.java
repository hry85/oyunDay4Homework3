package service;

import java.rmi.RemoteException;

import entitys.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter  implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player players) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(players.getNationaltyId()), players.getFirstName().toUpperCase(), players.getLastName().toUpperCase(), players.DateOfBirth);
			
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			
		}
		return true;
	
	}
	

}

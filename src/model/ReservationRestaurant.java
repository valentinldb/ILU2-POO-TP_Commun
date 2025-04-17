package model;

public class ReservationRestaurant extends Reservation {

	private final int service;
	private final int table;
	
	private final String message;
	
	//
	
	protected ReservationRestaurant(int jour, int mois, int service, int table) {
		super(jour, mois);
		
		//
		
		this.service = service;
		this.table = table;
		
		//
		
		StringBuilder message = new StringBuilder();
		
		String numService;
		switch(service) {
			case 1: numService = "premier"; break;
			case 2: numService = "deuxième"; break;
			default: numService = service + "è";
		}
		
		message.append("Le " + this.getJour() + "/" + this.getMois() + "\n");
		message.append("Table " + this.getTable() + " pour le " + numService + " service.");
		
		this.message = message.toString();
	}
	
	//
	
	public int getService() { return this.service; }
	
	public int getTable() { return this.table; }
	
	//
	
	@Override
	public String toString() { return this.message; }
	
}
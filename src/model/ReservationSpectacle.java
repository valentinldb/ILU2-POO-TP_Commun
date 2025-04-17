package model;

public class ReservationSpectacle extends Reservation {

	private final int zonePlace;
	private final int chaise;
	
	private final String toStringMessage;
	
	//
	
	public ReservationSpectacle(int jour, int mois, int zonePlace, int chaise) {
		super(jour, mois);
		
		//
		
		this.zonePlace = zonePlace;
		this.chaise = chaise;
		
		//
		
		StringBuilder toStringMessageBuilder = new StringBuilder();
		
		toStringMessageBuilder.append("Le " + this.getJour() + "/" + this.getMois() + " : ");
		toStringMessageBuilder.append("zone " + this.zonePlace() + ", chaise n°" + this.chaise() + ".");
		
		this.toStringMessage = toStringMessageBuilder.toString();
	}
	
	//
	
	public int zonePlace() { return this.zonePlace; }
	
	public int chaise() { return this.chaise; }
	
	//
	
	@Override
	public String toString() { return this.toStringMessage; }
	
}
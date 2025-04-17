package model;

public class ReservationHotel extends Reservation {

	private final int nombreLitsSimples;
	private final int nombreLitsDoubles;
	private final int chambre;
	
	private final String toStringMessage;
	
	//	
	
	public ReservationHotel(int jour, int mois, int nombreLitsSimples, int nombreLitsDoubles, int chambre) {
		super(jour, mois);
		
		//
		
		this.nombreLitsSimples = nombreLitsSimples;
		this.nombreLitsDoubles = nombreLitsDoubles;
		this.chambre = chambre;
		
		//
		
		StringBuilder messageBuilder = new StringBuilder();
		
		messageBuilder.append("Le " + this.getJour() + "/" + this.getMois() + " : ");
		messageBuilder.append("chambre n°" + this.chambre() + " ");
		messageBuilder.append("avec " + this.nombreLitsSimples() + " lits simples ");
		messageBuilder.append("et " + this.nombreLitsDoubles() + " lits doubles.");
		
		this.toStringMessage = messageBuilder.toString();
	}
	
	//	
	
	public int nombreLitsSimples() { return this.nombreLitsSimples; }
	
	public int nombreLitsDoubles() { return this.nombreLitsDoubles; }
	
	public int chambre() { return this.chambre; }
	
	//
	
	@Override
	public String toString() { return this.toStringMessage; }
	
}
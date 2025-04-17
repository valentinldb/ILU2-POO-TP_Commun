package model;

public abstract class Reservation {

	private int mois;
	private int jour;
	
	public Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	public int getJour() {
		return this.jour;
	}
	
	public int getMois() {
		return this.mois;
	}
	
	
	
	
}

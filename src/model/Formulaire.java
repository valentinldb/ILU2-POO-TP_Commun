package model;

public abstract class Formulaire {
	
	private final int jour;
	private final int mois;
	
	private int entityId;
	
	//	
	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	//
	
	public int getJour() { return this.jour; }
	
	public int getMois() { return this.mois; }
	
	public int getIdentificationEntite() { return this.entityId; }

	public void setIdentificationEntite(int id) { this.entityId = id; }

}
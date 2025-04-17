package model;

public abstract class EntiteReservable<F extends Formulaire, R extends Reservation> {
	
	protected final CalendrierAnnuel calendrier;
	
	private int id;
	
	//
	
	public EntiteReservable() {
		this.calendrier = new CalendrierAnnuel();
	}
	
	//
	
	public int getId() { return this.id; }
	
	public void setId(int id) { this.id = id; }
	
	//
	
	public boolean estLibre(F formulaire) {
		return this.calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract R reserver(F formulaire);

}
package model;

public class FormulaireRestaurant extends Formulaire {

	private final int nombrePersonnes;
	private final int service;
	
	//	
	
	public FormulaireRestaurant(int jour, int mois, int nombrePersonnes, int service) {
		super(jour, mois);
		
		//
		
		if(service != 1 && service != 2) {
			throw new IllegalArgumentException("The service should be 1 or 2.");
		}
		
		this.nombrePersonnes = nombrePersonnes;
		this.service = service;
	}
	
	//	
	
	public int getNombrePersonnes() { return this.nombrePersonnes; }
	
	public int getNumService() { return this.service; }
	
}
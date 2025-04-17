package model;

public class FormulaireSpectacle extends Formulaire {

	private final int zonePlace;
	
	//
	
	protected FormulaireSpectacle(int jour, int mois, int zonePlace) {
		super(jour, mois);
		
		//
		
		this.zonePlace = zonePlace;
	}

	//
	
	public int getZonePlace() { return this.zonePlace; }
	
}
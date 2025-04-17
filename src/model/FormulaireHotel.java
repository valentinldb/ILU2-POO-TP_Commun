package model;

public class FormulaireHotel extends Formulaire {

	private final int nombreLitsSimples;
	private final int nombreLitsDoubles;
	
	//
	
	protected FormulaireHotel(int jour, int mois, int nombreLitsSimples, int nombreLitsDoubles) {
		super(jour, mois);
		
		//
		
		this.nombreLitsSimples = nombreLitsSimples;
		this.nombreLitsDoubles = nombreLitsDoubles;
	}

	//
	
	public int getNombreLitsSimples() { return this.nombreLitsSimples; }
	
	public int getNombreLitsDoubles() { return this.nombreLitsDoubles; }
	
}
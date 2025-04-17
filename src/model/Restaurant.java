package model;

public class Restaurant {
	
	private final CentraleReservation<FormulaireRestaurant, ReservationRestaurant> centrale;

	//
	
	public Restaurant() {
		Table[] centraleEntites = new Table[10];
		this.centrale = new CentraleReservation<>(centraleEntites);
	}
	
	//
	
	public void ajouterTable(int nbChaises) {
		Table table = new Table(nbChaises);
		table.setId(this.centrale.ajouterEntite(table));
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) { return this.centrale.donnerPossibilites(formulaire); }
	
	public ReservationRestaurant reserver(int table, FormulaireRestaurant formulaire) { return this.centrale.reserver(table, formulaire); }
	
}
package control;

import model.CarnetClientele;
import model.Client;
import model.FormulaireRestaurant;
import model.Reservation;
import model.ReservationRestaurant;
import model.Restaurant;

public class ControlReserverTable {

	private final Restaurant restaurant;
	private final CarnetClientele carnetClientele;

	private final FormulaireRestaurant[] formulaires;
	
	//
	
	public ControlReserverTable(Restaurant restaurant, CarnetClientele carnetClientele) {
		this.restaurant = restaurant;
		this.carnetClientele = carnetClientele;
		this.formulaires = new FormulaireRestaurant[10];
	}
	
	//
	
	public int[] trouverPossibilite(int jour, int mois, int nombrePersonnes, int numService) {
		FormulaireRestaurant formulaire = new FormulaireRestaurant(jour, mois, nombrePersonnes, numService);

		boolean formulaireEnregistrer = false;
		int numeroFormulaire = -1;
		
		for (int i = 0; i < this.formulaires.length && !formulaireEnregistrer; i++) {
			if (this.formulaires[i] == null) {
				this.formulaires[i] = formulaire;
				formulaireEnregistrer = true;
				numeroFormulaire = i;
			}
		}
		
		int[] possibilites = this.restaurant.donnerPossibilites(formulaire);
		
		int[] retour = new int[possibilites.length + 1];
		retour[0] = numeroFormulaire;
		
		for (int i = 1; i < possibilites.length + 1; i++) {
			retour[i] = possibilites[i - 1];
		}
		
		return retour;
	}
	
	public void reserver(int numClient, int numProposition, int numeroFormulaire) {
		FormulaireRestaurant formulaireRestaurant = this.formulaires[numeroFormulaire];
	
		this.formulaires[numeroFormulaire] = null;
		Reservation reservation = restaurant.reserver(numProposition, formulaireRestaurant);
		
		if (reservation instanceof ReservationRestaurant reservationRestaurant) {
			Client client = this.carnetClientele.getClient(numClient);
			client.ajouterReservation(reservationRestaurant);
		}
	}

}
package model;

public class Table extends EntiteReservable<FormulaireRestaurant, ReservationRestaurant> {

	private final int nbChaises;
	
	private final CalendrierAnnuel calendrierSecondService;
	
	//
	
	public Table(int nbChaises) {
		this.nbChaises = nbChaises;
		this.calendrierSecondService = new CalendrierAnnuel();
	}
	
	//
	
	public int getNbChaises() { return this.nbChaises; }
	
	//
	
	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		int peopleCount = formulaire.getNombrePersonnes();
		int chairCount = this.getNbChaises();
		
		return (
			(chairCount == peopleCount || chairCount == peopleCount+1)
			&& (
				(formulaire.getNumService() == 1 && this.estLibre(formulaire))
				|| (formulaire.getNumService() == 2 && this.calendrierSecondService.estLibre(formulaire.getJour(), formulaire.getMois()))
			)
		);
	}
	
	@Override
	public ReservationRestaurant reserver(FormulaireRestaurant formulaire) {
		ReservationRestaurant result = null;
		
		if(this.compatible(formulaire)) {
			CalendrierAnnuel calendrierConcerne;
			
			switch(formulaire.getNumService()) {
				case 1: calendrierConcerne = this.calendrier; break;
				case 2: calendrierConcerne = this.calendrierSecondService; break;
				default: calendrierConcerne = this.calendrier; break;
			}
			
			boolean succesReservation = calendrierConcerne.reserver(formulaire.getJour(), formulaire.getMois());
			if(succesReservation) {
				result = new ReservationRestaurant(
					formulaire.getJour(),
					formulaire.getMois(),
					formulaire.getNumService(),
					formulaire.getIdentificationEntite()
				);
			}
		}
		
		return result;
	}
	
}
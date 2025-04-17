package model;

public class CentraleReservation<F extends Formulaire, R extends Reservation> {

	private final EntiteReservable<F, R>[] entites;
	private int nbEntites;
	
	//
	
	public CentraleReservation(EntiteReservable<F, R>[] entites) {
		this.entites = entites;
		this.nbEntites = 0;
	}
	
	//
	
	public int ajouterEntite(EntiteReservable<F, R> entite) {
		if(this.nbEntites >= this.entites.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		int id = this.nbEntites + 1;
		
		entite.setId(id);
		this.entites[this.nbEntites] = entite;
		
		this.nbEntites++;
		
		return id;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] result = new int[this.nbEntites];
		
		EntiteReservable<F, R> entite;
		for(int i = 0; i < this.nbEntites; i++) {
			entite = this.entites[i];
			result[i] = entite.compatible(formulaire) ? entite.getId() : 0;
		}
		
		return result;
	}
	
	public R reserver(int id, F formulaire) {
		int entityIndex = id - 1;
		
		if(entityIndex < 0 || entityIndex >= this.nbEntites) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		EntiteReservable<F, R> entite = this.entites[entityIndex];
		
		formulaire.setIdentificationEntite(entite.getId());
		
		return entite.reserver(formulaire);
	}
	
}
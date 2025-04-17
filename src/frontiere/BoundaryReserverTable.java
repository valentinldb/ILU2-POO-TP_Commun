package frontiere;

import control.ControlReserverTable;

public class BoundaryReserverTable {

	private final ControlReserverTable controlReserverTable;
	
	//
	
	public BoundaryReserverTable(ControlReserverTable controlReserverTable) {
		this.controlReserverTable = controlReserverTable;
	}
	
	//
	
	public void reserverTable(int numClient) {
		System.out.println("Quand souhaitez-vous réserver ?");
		
		int mois = Clavier.entrerEntier("Pour quel mois ?");
		int jour = Clavier.entrerEntier("Pour quel jour ?");
		
		int[] possibilites;
		int choix = -1;
		
		boolean tableChoisie = false;
		do {
			int nombrePersonnes = Clavier.entrerEntier("Pour combien de personnes ?");
			int numService = Clavier.entrerEntier("Pour quel service ?");
			
			possibilites = this.controlReserverTable.trouverPossibilite(jour, mois, nombrePersonnes, numService);
			
			boolean auMoinsUneTable = false;
			for(int i = 1; i < possibilites.length && !auMoinsUneTable; i++) {
				auMoinsUneTable = possibilites[i] > 0;
			}
			
			if(auMoinsUneTable) {
				do {
					for(int i = 1; i < possibilites.length; i++) {
						int possibilite = possibilites[i];
						
						if(possibilite > 0) {
							System.out.println("- numéro de table : " + possibilites[i]);
						}
					}
					
					choix = Clavier.entrerEntier("Choisissez votre table : ");
					
					tableChoisie = choix < possibilites.length && possibilites[choix] > 0;
					
					if(!tableChoisie) {
						System.out.println("Cette table n'est pas disponible.");
					}
				} while(!tableChoisie);
			}
			else {
				System.out.println("Aucune table correspondant à vos critères n'a été trouvée.");
			}
		} while(!tableChoisie);
		
		this.controlReserverTable.reserver(numClient, choix, possibilites[0]);
	}
	
}
package model;

public class CalendrierAnnuel {
	
	private static class Mois {
		
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for (int i = 0; i<nbJours; i++) {
				this.jours[i] = false;
			}
			
		}
		
		private boolean estLibre(int jour) {
			if(jour > this.jours.length) {
				throw new IllegalArgumentException();
			}
			return !this.jours[jour-1];
		}
		
		private void reserver(int jour) {
			if(jour > this.jours.length) {
				throw new IllegalArgumentException();
			}
			else {
				if(this.jours[jour-1]) {
					throw new IllegalStateException();
				}
				else {
					this.jours[jour-1] = false;
				}
			}
		}
		
	}
	
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		
	}
	
	
	
}

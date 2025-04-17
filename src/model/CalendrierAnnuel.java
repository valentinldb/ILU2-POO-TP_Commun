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
					this.jours[jour-1] = true;
				}
			}
		}
		
	}
	
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		
		this.calendrier = new Mois[12];
		
		this.calendrier[0] = new Mois("Janvier", 31);
		this.calendrier[1] = new Mois("Février", 28);
		this.calendrier[2] = new Mois("Mars", 31);
		this.calendrier[3] = new Mois("Avril", 30);
		this.calendrier[4] = new Mois("Mai", 31);
		this.calendrier[5] = new Mois("Juin", 30);
		this.calendrier[6] = new Mois("Juillet", 31);
		this.calendrier[7] = new Mois("Août", 31);
		this.calendrier[8] = new Mois("Septembre", 30);
		this.calendrier[9] = new Mois("Octobre", 31);
		this.calendrier[10] = new Mois("Novembre", 30);
		this.calendrier[11] = new Mois("Décembre", 31);
		
	}
	
	public boolean estLibre(int jour, int mois) {
		if(mois < 1 || mois > this.calendrier.length) {
			throw new IllegalArgumentException();
		}
		return this.calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		try {
			if(mois < 1 || mois > this.calendrier.length) {
				throw new IllegalArgumentException();
			}
			
			this.calendrier[mois-1].reserver(jour);
			
			return true;
		} catch(IllegalStateException e) {
			return false;
		}
	}
	
	
	
}

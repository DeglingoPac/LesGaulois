package lieux;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Gaulois chef;
	
	public Village(String nom,final int NB_VILLAGEOIS_MAX) {
	super();
	this.nom = nom;
	villageois = new Gaulois[NB_VILLAGEOIS_MAX];
		
	}
	public String getNom() {
		return nom;
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef + " vivent les légendaires gaulois :");
		for (Gaulois gaulois : villageois) {
			if (gaulois != null) {
				System.out.println(" - " + gaulois);
			}
		}
	}	
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public void ajouterChef(Gaulois gaulois) {
		chef = gaulois;
		gaulois.devientChef();
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (villageois[numVillageois - 1] != null) {
			return villageois[numVillageois - 1];
		}
		else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}
	}
	@Override
	public String toString() {
		return "Village [nom=" + nom + ", nbVillageois=" + nbVillageois + "]";
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		village.ajouterChef(abraracourcix);
		Gaulois astérix = new Gaulois("Astérix", 8);
		Gaulois obélix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(astérix);
		village.ajouterVillageois(obélix);
		village.afficherVillageois();
	}
}
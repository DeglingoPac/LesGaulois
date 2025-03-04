package personnages;

import lieux.Village;
import objet.Chaudron;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private boolean estChef = false;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void devientChef() {
		estChef = true; 
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
		
	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = force * effetPotion / 3;
		if (effetPotion > 1) {
			effetPotion = effetPotion - 1;
		}
		romain.recevoirCoup(forceCoup);
	}
	
	public void boirePotion(Chaudron chaudron) {
		effetPotion = chaudron.getForcePotion();
	}

	public static void main(String[] args) {
		Gaulois astérix = new Gaulois("Astérix", 8);
	}
	
	public void setVillage(Village village) {
		
	}
}

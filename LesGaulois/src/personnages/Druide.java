package personnages;

import objet.Chaudron;

public class Druide {
	private String nom;
	private int force;
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void booster(Gaulois gaulois, Chaudron chaudron) {
		if (chaudron.resterPotion()) {
			if (gaulois.getNom() == "Obélix") {
				parler("Non " + gaulois.getNom() + " Non !... Tu le sais très bien !");
			}
			else {
				chaudron.prendreLouche();
				gaulois.boirePotion(chaudron);
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");				
			}
		}
		else {
			parler("Désolé " + gaulois.getNom() + "il n'y a plus une seule goutte de potion.");
		}
	}
	
	public void fabriquerPotion(int quantite, int forcePotion, Chaudron chaudron) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concoté " + quantite + " doses de potions magique. Elle a une force de " + forcePotion + ".");
	}
}
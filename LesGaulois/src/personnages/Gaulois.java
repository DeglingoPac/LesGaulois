package personnages;

import lieux.Musee;
import lieux.Village;
import objet.Chaudron;
import objet.Trophee;

public class Gaulois {
	private String nom;
//	private int force;
	private int effetPotion = 1;
	private boolean estChef = false;
	private Village village;
	private int force;
	private int nbTrophees = 0;
	private Trophee[] trophees = new Trophee[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void devientChef(Village village) {
		estChef = true;
		setVillage(village);
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
	
//	public void frapper(Romain romain) {
//		String nomRomain = romain.getNom();
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
//		int forceCoup = force * effetPotion / 3;
//		if (effetPotion > 1) {
//			effetPotion = effetPotion - 1;
//		}
//		romain.recevoirCoup(forceCoup);
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
		romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
			}
		}
	
	public void boirePotion(Chaudron chaudron) {
		effetPotion = chaudron.getForcePotion();
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void sePresenter() {
		if (village != null) {
			parler("Bonjour, je m'appelle " + nom +". J'habite le village " + village +".");
		}
		else {
			if (estChef) {
				parler("Bonjour, je m'appelle " + nom + ". Je suis le chef du village " + village + ".");
			}
			else {
				parler("Bonjour, je m'appelle " + nom + "Je voyage de village en village.");
			}
		}
		
	}
	
	public void faireUneDonnation(Musee musee) {
		if (trophees != null) {
			parler("Je donne au musee tous mes trophees");
			while (trophees != null) {
				musee.donnerTrophees(this, trophees[nbTrophees -1]);
				nbTrophees--;
				System.out.println("- " + trophees[nbTrophees - 1]);
			}
		}
		
	}
	
	public String extraireInstructionOCaml() {
		String texte = "let musee = [\n";
		for (Trophee trophee : trophees) {
			texte += "\t\"" + nom +"\", \"" + trophee +"\"";
		}
		return texte;
	}
}

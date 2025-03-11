package personnages;

import objet.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		int forceInitiale = force;
		force = force - forceCoup;
		assert isInvariantVerified();
		if (force > 0) {
			parler("Aïe");
		}
		else {
			parler("J'abandonne");
		}
		assert forceInitiale > force;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0 : 
			equipements[0] = equipement;
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
			nbEquipement++;
			break;
		case 1 :
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + ".");
			}
			else {
				equipements[1] = equipement;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
				nbEquipement++;
			}
			break;
		case 2 : 
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		}
	}
	
	private boolean isInvariantVerified() {
		return force > 0;
	}
	
	@Override
	public String toString() {
		return nom;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}

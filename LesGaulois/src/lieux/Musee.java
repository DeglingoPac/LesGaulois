package lieux;

import objet.Trophee;
import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
	private Trophee[] trophees = new Trophee[100];
	private int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Trophee trophee) {
		trophees[nbTrophee] = trophee;
		nbTrophee++;
		
	}
	
}

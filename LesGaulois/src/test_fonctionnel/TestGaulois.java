package test_fonctionnel;

import objet.Chaudron;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois astérix = new Gaulois("Astérix", 8);
		Gaulois obélix = new Gaulois("Obélix", 16);
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		Chaudron chaudron = new Chaudron();
		panoramix.fabriquerPotion(4, 3, chaudron);
		panoramix.booster(obélix, chaudron);
		panoramix.booster(astérix, chaudron);
		for (int i=0;i<3;i++) {
			astérix.frapper(brutus);
		}
		
	}
}

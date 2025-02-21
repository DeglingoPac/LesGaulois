package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois astérix = new Gaulois("Astérix", 8);
		Gaulois obélix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);
		astérix.parler("Bonjour "+ obélix.getNom() + ".");
		obélix.parler("Bonjour " + astérix.getNom() + ". Ca te dirais d'aller chasser des sangliers ?");
		astérix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt " + astérix.getNom() + " et " + obélix.getNom() + " tombent nez à nez avec le romain " + minus.getNom() + ".");
		for (int i=0;i<3;i++) {
			astérix.frapper(minus);
		}
	}
}

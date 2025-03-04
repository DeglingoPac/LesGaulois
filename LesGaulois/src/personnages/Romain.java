package personnages;

public class Romain {
	private String nom;
	private int force;
	
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
		force = force - forceCoup;
		assert isInvariantVerified();
		if (force > 0) {
			parler("Aïe");
		}
		else {
			parler("J'abandonne");
		}
	}
	
	private boolean isInvariantVerified() {
		if (force < 0) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}
}

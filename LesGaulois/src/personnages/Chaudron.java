package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantité, int forcePotion) {
		this.quantitePotion = quantité;
		this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		if (quantitePotion == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	
	public int getForcePotion() {
		return forcePotion;
	}

	public void setForcePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}

	public void prendreLouche() {
		quantitePotion = quantitePotion - 1;
		if (quantitePotion == 0) {
			forcePotion = 0;
		}
	}
	
	
}

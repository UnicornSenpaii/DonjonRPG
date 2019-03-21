package personnages;

public abstract class Personnage {

	private int hp;
	private int strength;
	private int maxHp;
	private int critique;

	public Personnage(int hp, int strength, int critique) {
		super();
		this.hp = hp;
		this.strength = strength;
		this.maxHp = hp;
		this.critique = critique;
	}

	public int getCritique() {
		return critique;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp <= 0)
			this.hp = 0;
		else
			this.hp = hp;
	}

	public void coupCritique(Personnage ennemi, double valeur) {
		int x;
		x = (int) (Math.random() * 10);
		if (x <= valeur) {
			ennemi.setHp(ennemi.getHp() - (this.getStrength()));
			System.out.println("Coup critique !!!");
		}

	}

	public abstract void useSkill(Personnage personnage);

	public boolean isKO() {
		if (this.hp <= 0) {
			return true;
		} else {
			return false;
		}

	}

}

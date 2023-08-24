package ch10_extends_interface.starcraft;

public class Zealot extends StarUnit {
	private int shileld;

	public Zealot() {
		this("질럿", 16, 100, 1, 60);
	}

	public Zealot(String name, int damage, int hp, int armor, int shield) {
		super(name, damage, hp, armor);
		this.shileld = shileld;

	}

	@Override
	public String toString() {
		return "Zealot [shileld=" + shileld + ", getName()=" + getName() + ", getDamage()=" + getDamage() + ", getHp()="
				+ getHp() + ", getArmor()=" + getArmor() + "]";
	}

	public int getShileld() {
		return shileld;
	}

	public void setShileld(int shileld) {
		this.shileld = shileld;
	}

}

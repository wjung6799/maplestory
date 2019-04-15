package gameobjects.user;

public class Status {
	private int strength;
	private int dexterity;
	private int intelligence;
	private int luck;
	
	public Status(int strength, int dexterity, int intelligence, int luck) {
		setStrength(strength);
		setDexterity(dexterity);
		setIntelligence(intelligence);
		setLuck(luck);
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}
}

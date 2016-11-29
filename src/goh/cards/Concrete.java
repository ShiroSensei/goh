package goh.cards;

public abstract class Concrete extends Card {

	// Attributes
	protected Integer dmg;
	protected Integer hp;
	private Concrete target;
	private Concrete attacker;
	
	
	// Getters & Setters
	public Integer getDmg() {
		return this.dmg;
	}
	public void setDmg(Integer dmg) {
		this.dmg = dmg;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	
	public Concrete getTarget() {
		return target;
	}
	public void setTarget(Concrete target) {
		this.target = target;
	}
	public Concrete getAttacker() {
		return attacker;
	}
	public void setAttacker(Concrete attacker) {
		this.attacker = attacker;
	}
	
	// Functions
	public Concrete targets(Concrete target) {
		attacker = this;
		this.setTarget(target);
		System.out.println(attacker.getCardName() + " cible " + target.getCardName());
		return target;
	}
	
	public void attacks(Concrete target) {
		attacker = this;
		System.out.println(attacker.getCardName() + " attaque " + target.getCardName());
		int targetHp = target.getHp();
		targetHp = targetHp - this.getDmg();
		target.setHp(targetHp);
		// Counter-attack
		int attackerHp = this.getHp();
		attackerHp = attackerHp - target.getDmg();
		this.setHp(attackerHp);
	}
	
}

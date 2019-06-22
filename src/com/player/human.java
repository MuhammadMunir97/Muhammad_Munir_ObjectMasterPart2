package com.player;

public class human {
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	protected void attack(human enemy) {
		enemy.health -= strength;
	}
	protected void setStrength(int val) { strength = val; };
	protected void setStealth(int val) { stealth = val; };
	protected void setIntelligence(int val) { intelligence = val; };
	protected void setHealth(int val) { health = val; };
	
	public int retStrength () {return strength;};
	public int retStealth () {return stealth;};
	public int retIntelligence () {return intelligence;};
	public int retHealth () {return health;};
	
}

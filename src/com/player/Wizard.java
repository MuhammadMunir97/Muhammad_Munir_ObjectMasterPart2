package com.player;

public class Wizard extends human{
	Wizard(){
		setHealth(50);
		setIntelligence(8);
	}
	public void heal( human friend) {
		friend.setHealth(friend.retHealth()+ retIntelligence());
	}
	public void fireball(human enemy) {
		enemy.setHealth(enemy.retHealth()-(retIntelligence()*3));
	}
}

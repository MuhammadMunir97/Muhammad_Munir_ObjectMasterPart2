package com.player;

public class Wizard extends human{
	Wizard(){
		health = 50;
		intelligence = 8;
	}
	public void heal( human friend) {
		friend.health += intelligence;
	}
	public void fireball(human enemy) {
		enemy.health -= (intelligence*3);
	}
}

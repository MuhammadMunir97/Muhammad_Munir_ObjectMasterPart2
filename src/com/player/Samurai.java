package com.player;

public class Samurai extends human{
	private int numberOfSamurais = 0;
	Samurai(){
		health = 200;
		numberOfSamurais += 1;
	}
	public void deathblow(human enemy) {
		health /= 2;
		enemy.health = 0;
	}
	public void meditate() {
		health += (health / 2);
	}
	public int returnNumOfSamurais() { return numberOfSamurais;	}
}

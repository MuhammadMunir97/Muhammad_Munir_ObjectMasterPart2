package com.player;

public class Samurai extends human{
	private int numberOfSamurais = 0;
	Samurai(){
		setHealth(200);
		numberOfSamurais += 1;
	}
	public void deathblow(human enemy) {
		setHealth(retHealth()/2);
		enemy.setHealth(0);
	}
	public void meditate() {
		setHealth(retHealth()+(retHealth()/2));
	}
	public int returnNumOfSamurais() { return numberOfSamurais;	}
}

package com.player;

public class Ninja extends human {
	Ninja(){
		setStealth(10);
	}
	public void steal (human enemy) {
		// this would not work if the health is bellow 100 to make that work this program needs to be a
		// little more complex
		enemy.setHealth(enemy.retHealth() - retStealth());
		setHealth(retHealth() + retStealth());
	}
	public void runAway () {
		setHealth(retHealth()-10);
	}
}

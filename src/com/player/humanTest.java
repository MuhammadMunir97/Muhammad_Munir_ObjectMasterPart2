package com.player;

public class humanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard harry = new Wizard();
		Ninja tnmnt = new Ninja();
		Samurai jack = new Samurai();
		
		harry.fireball(tnmnt);
		System.out.println("tnmnt's health:" + tnmnt.health);
		
		harry.heal(tnmnt);
		System.out.println("tnmnt's health after being healed: "+ tnmnt.health);
		
		System.out.println("jack's health: "+ jack.health);
		tnmnt.steal(jack);
		System.out.println("jack's health after being attacked: " + jack.health);
		System.out.println("tnmnt's health after stealing: " + tnmnt.health);
		
		tnmnt.runAway();
		System.out.println("tnmnt's health after running away: " + tnmnt.health);
		
		jack.deathblow(tnmnt);
		System.out.println("tnmnt's health after jack's deathblow: "+ tnmnt.health);
		
		jack.meditate();
		System.out.println("jacks health after meditation: "+ jack.health);
		
		System.out.println("total number of samurai's: " + jack.returnNumOfSamurais());
	}

}

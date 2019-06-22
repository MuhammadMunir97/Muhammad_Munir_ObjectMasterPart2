package com.player;

public class humanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard harry = new Wizard();
		Ninja tnmnt = new Ninja();
		Samurai jack = new Samurai();
		
		harry.fireball(tnmnt);
		System.out.println("tnmnt's health after being attacked:" + tnmnt.retHealth());
		
		harry.heal(tnmnt);
		System.out.println("tnmnt's health after being healed: "+ tnmnt.retHealth());
		
		System.out.println("jack's health: "+ jack.retHealth());
		tnmnt.steal(jack);
		System.out.println("jack's health after being attacked: " + jack.retHealth());
		System.out.println("tnmnt's health after stealing: " + tnmnt.retHealth());
		
		tnmnt.runAway();
		System.out.println("tnmnt's health after running away: " + tnmnt.retHealth());
		
		jack.deathblow(tnmnt);
		System.out.println("tnmnt's health after jack's deathblow: "+ tnmnt.retHealth());
		
		jack.meditate();
		System.out.println("jacks health after meditation: "+ jack.retHealth());
		
		System.out.println("total number of samurai's: " + jack.returnNumOfSamurais());
	}

}

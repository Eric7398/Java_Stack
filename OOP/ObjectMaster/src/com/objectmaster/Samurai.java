package com.objectmaster;

public class Samurai extends Human {
	
	static int counter = 0;

	public Samurai(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setHealth(200);
		counter++;
	}
	
	public void deathBlow(Human person) {
		person.setHealth(0);
		this.setHealth(this.getHealth()/2);
		System.out.println(person.getName() + " has died and " + this.getName() + " has lost half their health. Remaining health is " + this.getHealth() + ".");
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()/2 + this.getHealth());
		System.out.println(this.getName() + " has meditated and now has " + this.getHealth() + " health.");
	}
	
	static int howMany() {
		return counter;
	}

}

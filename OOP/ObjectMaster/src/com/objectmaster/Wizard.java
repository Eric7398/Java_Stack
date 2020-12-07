package com.objectmaster;

public class Wizard extends Human {

	public Wizard(String name) {
		super(name);
		this.setHealth(50);
		this.setIntelligence(8);
		// TODO Auto-generated constructor stub
	}
	
	public void fireBall(Human person) {
		person.changeHealth(-1*3*this.getIntelligence());
		System.out.println(person.getName() + " got hit by a fireball. Health is now " + person.getHealth());
	}
	
	public void heal(Human person) {
		person.changeHealth(1*this.getIntelligence());
		System.out.println(person.getName() + " got healed by " + this.getName() + " Health is now " + person.getHealth());
	}

}

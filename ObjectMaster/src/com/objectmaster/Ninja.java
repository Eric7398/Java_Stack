package com.objectmaster;

public class Ninja extends Human {

	public Ninja(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setStealth(10);
	}
	
	public void steal(Human person) {
		person.changeHealth(-1*this.getStealth());
		this.changeHealth(1*this.getStealth());
		System.out.println(person.getName() + " got robbed by " + this.getName() + " and lost " + person.getHealth() + " health.");
	}
	
	public void runAway() {
		this.changeHealth(-10);
		System.out.println(this.getName() + " has ran away losing 10 health.");
	}
}

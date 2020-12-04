package com.objectmaster;

public class Human {
	private String name;
	private int health;
	private int strength;
	private int stealth;
	private int intelligence;
	
	
	public Human(String name) {
		this.name = name;
		this.setHealth(100);
		this.setIntelligence(3);
		this.setStealth(3);
		this.setStrength(3);
	}
	
	
	public void changeHealth(int change) {
		this.health += change;
	}
	
	
	public void attack(Human person) {
		person.changeHealth(-1*this.strength);
		System.out.println(person.name + " got attacked by " + this.name + ". Health is now " + person.health + ".");
	}
	
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

package com.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human Eric = new Human("Eric");
		Human Trevor = new Human("Trevor");
		Ninja Derek = new Ninja("Derek");
		Ninja Jared = new Ninja("Jared");
		Samurai Duy = new Samurai("Duy");
		Samurai Ikaika = new Samurai("Ikaika");
		Wizard Kento = new Wizard("Kento");
		Wizard Grasen = new Wizard("Grasen");
		
		Eric.attack(Trevor);
		Trevor.attack(Grasen);
		Derek.steal(Ikaika);
		Jared.runAway();
		Duy.deathBlow(Jared);
		Ikaika.deathBlow(Ikaika);
		Duy.meditate();
		Kento.fireBall(Duy);
		Kento.heal(Ikaika);
		Grasen.fireBall(Jared);
		System.out.println("There is a total of " + Samurai.howMany() + " Samurai(s) right now.");
	}

}

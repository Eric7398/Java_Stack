
public class Gorilla extends Mammal {
	
	public Gorilla() {
		this.setEnergyLevel(100);
		System.out.println("It's a Gorilla, tell it to do something!");
	}
	
	public void throwSomething() {
		this.changeEnergy(-5);
		System.out.println("Gorilla has thrown something!");
		System.out.println("Energy Level: " + this.getEnergyLevel());

	}
	
	public void eatBanana() {
		this.changeEnergy(10);
		System.out.println("Gorilla has eaten a banana! YUM!");
		System.out.println("Energy Level: " + this.getEnergyLevel());
	}
	
	public void climb() {
		this.changeEnergy(-10);
		System.out.println("Gorilla has climbed something!");
		System.out.println("Energy Level: " + this.getEnergyLevel());

	}
}
	

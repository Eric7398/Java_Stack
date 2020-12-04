
public class Bat extends Mammal {
	
	public Bat() {
		this.setEnergyLevel(300);
		System.out.println("Oh look it's a giant bat!!!");
	}
	
	public void fly() {
		this.changeEnergy(-50);
		System.out.println("Giant Bat is flying around");
		System.out.println("Energy Level: " + this.getEnergyLevel());
	}
	
	public void eatHumans() {
		this.changeEnergy(25);
		System.out.println("Giant Bat is eating humans!!");
		System.out.println("Energy Level:" + this.getEnergyLevel());
	}
	
	public void attackTown() {
		this.changeEnergy(-100);
		System.out.println("Giant Bat is flying around");
		System.out.println("Energy Level: " + this.getEnergyLevel());
	}
	
}

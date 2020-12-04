
public class Mammal {
	private int energyLevel;
	
	
	public Mammal() {
	}
	
	
	public int displayEnergy() {
		return (energyLevel);
	}
	
	
	public void changeEnergy(int change) {
		this.energyLevel += change;
	}
	

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}

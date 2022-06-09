package com.dannycho.zookeeper;

public class Mammals {
	
	// attributes
	protected int energyLevel = 100;
	
	// other methods
	public int displayEnergy() {
		System.out.println("Current energy level: " + energyLevel);
		System.out.println("---");
		return energyLevel;
	}
	
	// getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}

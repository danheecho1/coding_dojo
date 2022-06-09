package com.dannycho.zookeeper;

public class Bat extends Mammals {

	private String name; 
	
	public Bat(String name) {
		this.name = name;
		super.energyLevel = 300;
		System.out.println("A bat named " + name + " has appeared!");
	}

	public void fly() {
		System.out.println(name + " is flying away - psttttttt");
		this.energyLevel -=50;
		this.displayEnergy();
	}
	
	public void eatHuman() {
		System.out.println(name + " is nom nomming a human.");
		this.energyLevel += 25;
		this.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println(name + " is bringing fire to the town. pzswpswpzwpw");
		this.energyLevel -= 100;
		this.displayEnergy();
	}

}

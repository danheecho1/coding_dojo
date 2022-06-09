package com.dannycho.zookeeper;

public class Gorilla extends Mammals {

	private String name;

	public Gorilla(String name) {
		this.name = name;
		System.out.println("A gorilla named " + name + " has appeared!");
	}

	// methods
	public void throwSomething(String thing) {
		System.out.println(this.name + " has thrown a " + thing + " nearby off the fence!");
		this.energyLevel -= 5;
		this.displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println(this.name + " has eaten a banana and is feeling satisfied like there's no tomorrow!");
		this.energyLevel += 10;
		this.displayEnergy();
	}
	
	public void climb() {
		System.out.println(this.name + " climbed a tree and got stung by 256 bees!");
		this.energyLevel -= 10;
		this.displayEnergy();
	}	
}

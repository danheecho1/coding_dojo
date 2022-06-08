package com.dannycho.zookeeper;

public class Gorilla extends Mammals {

	// methods
	public void throwSomething(String thing) {
		System.out.println("Gorilla has thrown a " + thing + " nearby off the fence!");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Gorilla has eaten a banana and is feeling satisfied like a bonono!");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla climbed a tree and got stung by 256 bees!");
		this.energyLevel -= 10;
	}	
}

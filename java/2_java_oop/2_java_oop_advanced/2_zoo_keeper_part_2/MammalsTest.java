package com.dannycho.zookeeper;

public class MammalsTest {

	public static void main(String[] args) {

		Gorilla Harambe = new Gorilla("Harambe"); 
		
		Harambe.throwSomething("monkey");
		Harambe.throwSomething("pineapple");
		Harambe.throwSomething("Ford Focus");
		Harambe.eatBananas();
		Harambe.eatBananas();	
		Harambe.climb();
		
		Bat Betman = new Bat("Betman");
		
		Betman.attackTown();
		Betman.attackTown();
		Betman.attackTown();
		Betman.eatHuman();
		Betman.eatHuman();
		Betman.fly();
	}
}

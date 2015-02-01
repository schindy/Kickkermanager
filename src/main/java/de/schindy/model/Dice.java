package de.schindy.model;

import java.util.Random;

public class Dice {

	private int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void roll() {
		Random random = new Random();
		number = random.nextInt(6) + 1; 
	}
}

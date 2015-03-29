package de.schindy.model;

import java.util.Random;


public class Cast {
	
	private int dice1;
	private int dice2;
	private int dice3;
	private int dice4;
	private int dice5;
	private int dice6;
	private int id;
	
	public int getDice1() {
		return dice1;
	}

	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}

	public int getDice2() {
		return dice2;
	}

	public void setDice2(int dice2) {
		this.dice2 = dice2;
	}

	public int getDice3() {
		return dice3;
	}

	public void setDice3(int dice3) {
		this.dice3 = dice3;
	}

	public int getDice4() {
		return dice4;
	}

	public void setDice4(int dice4) {
		this.dice4 = dice4;
	}

	public int getDice5() {
		return dice5;
	}

	public void setDice5(int dice5) {
		this.dice5 = dice5;
	}

	public int getDice6() {
		return dice6;
	}

	public void setDice6(int dice6) {
		this.dice6 = dice6;
	}

	@Override
	public String toString() {
		return "Dice 1: " + dice1 + "\n" + "Dice 2: "
				+ dice2 + "\n" + "Dice 3: " + dice3
				+ "\n" + "Dice 4: " + dice4 + "\n" + "Dice 5: "
				+ dice5 + "\n" + "Dice 6: " + dice6;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

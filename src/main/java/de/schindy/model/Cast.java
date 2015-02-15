package de.schindy.model;


public class Cast {
	
	private Dice dice1;
	private Dice dice2;
	private Dice dice3;
	private Dice dice4;
	private Dice dice5;
	private Dice dice6;
	private int id;
	
	
	public Cast() {
		this.dice1 = new Dice();
		this.dice2 = new Dice();
		this.dice3 = new Dice();
		this.dice4 = new Dice();
		this.dice5 = new Dice();
		this.dice6 = new Dice();
	}
	
	public Dice getDice1() {
		return dice1;
	}

	public void setDice1(Dice dice1) {
		this.dice1 = dice1;
	}

	public Dice getDice2() {
		return dice2;
	}

	public void setDice2(Dice dice2) {
		this.dice2 = dice2;
	}

	public Dice getDice3() {
		return dice3;
	}

	public void setDice3(Dice dice3) {
		this.dice3 = dice3;
	}

	public Dice getDice4() {
		return dice4;
	}

	public void setDice4(Dice dice4) {
		this.dice4 = dice4;
	}

	public Dice getDice5() {
		return dice5;
	}

	public void setDice5(Dice dice5) {
		this.dice5 = dice5;
	}

	public Dice getDice6() {
		return dice6;
	}

	public void setDice6(Dice dice6) {
		this.dice6 = dice6;
	}

	public void castAll() {
		dice1.roll();
		dice2.roll();
		dice3.roll();
		dice4.roll();
		dice5.roll();
		dice6.roll();
	}
	

	@Override
	public String toString() {
		return "Dice 1: " + dice1.getNumber() + "\n" + "Dice 2: "
				+ dice2.getNumber() + "\n" + "Dice 3: " + dice3.getNumber()
				+ "\n" + "Dice 4: " + dice4.getNumber() + "\n" + "Dice 5: "
				+ dice5.getNumber() + "\n" + "Dice 6: " + dice6.getNumber();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

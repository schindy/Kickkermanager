package de.schindy.model;

public class Round {

	private int id;
	private int cast1ID;
	private int cast2ID;
	private int cast3ID;
	private String type;
	private boolean isSet;
	private int game_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isSet() {
		return isSet;
	}

	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public int getCast1ID() {
		return cast1ID;
	}

	public void setCast1ID(int cast1id) {
		cast1ID = cast1id;
	}

	public int getCast2ID() {
		return cast2ID;
	}

	public void setCast2ID(int cast2id) {
		cast2ID = cast2id;
	}

	public int getCast3ID() {
		return cast3ID;
	}

	public void setCast3ID(int cast3id) {
		cast3ID = cast3id;
	}

}

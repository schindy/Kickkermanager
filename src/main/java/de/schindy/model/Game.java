package de.schindy.model;

public class Game {
	private int id;
	private int user_id;
	private int pointsnote_id;
	private boolean finished;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPointsnote_id() {
		return pointsnote_id;
	}
	public void setPointsnote_id(int pointsnote_id) {
		this.pointsnote_id = pointsnote_id;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	
}

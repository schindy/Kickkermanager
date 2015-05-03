package de.schindy.model;

public class Game {
	private int id;
	private int userId;
	private int pointsnoteId;
	private boolean finished;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPointsnoteId() {
		return pointsnoteId;
	}
	public void setPointsnoteId(int pointsnoteId) {
		this.pointsnoteId = pointsnoteId;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	
}

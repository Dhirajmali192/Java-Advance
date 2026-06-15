package com.tka.entity;

public class Player {
	private int playerId;
	private int jersey_no;
	private String name;
	private String team;
	private int runs;
	private int wickets;
	private String role;
	
	public Player() {
	}

	public Player(int playerId ,int jersey_no, String name, String team, int runs, int wickets, String role) {
		this.playerId=playerId;
		this.jersey_no = jersey_no;
		this.name = name;
		this.team = team;
		this.runs = runs;
		this.wickets = wickets;
		this.role=role;
	}
	
	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getJersey_no() {
		return jersey_no;
	}

	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + "]";
	}

}

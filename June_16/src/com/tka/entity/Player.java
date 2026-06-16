package com.tka.entity;

public class Player {
	private int jn;
	private String name ;
	private String team;
	private int runs;
	private int wickets;
	private String role;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int jn, String name, String team, int runs, int wickets, String role) {
		this.jn = jn;
		this.name = name;
		this.team = team;
		this.runs = runs;
		this.wickets = wickets;
		this.role = role;
	}

	public int getJn() {
		return jn;
	}

	public void setJn(int jn) {
		this.jn = jn;
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
		return "Player [jn=" + jn + ", name=" + name + "]";
	}
	
}

package com.tka.entity;

public class Player {
	
	private int id;
	private String pname;
	private int jno;
	private int runs;
	private int wickets;
	private String tname;
	private String role;
	
	public Player() {
		
	}
	
	public Player(int id, String pname, int jno, int runs, int wickets, String tname, String role) {
		super();
		this.id = id;
		this.pname = pname;
		this.jno = jno;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		this.jno = jno;
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

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", pname=" + pname + "]";
	}
	
	
}

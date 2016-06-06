package com.myweb;

public class User {
	
	public int id;
	public String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User[id="+getId()+",name="+getName()+"]";
	}
	
}

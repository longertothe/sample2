package com.SpringApp;

public class Jio  implements Sim{
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void displya() {
		System.out.println("jio sim");
		
	}
	

}

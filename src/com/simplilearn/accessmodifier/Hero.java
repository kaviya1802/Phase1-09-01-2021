package com.simplilearn.accessmodifier;

public class Hero {

	public String name = "Vijay";
	protected String power = "Entertaining";
	
	protected String showPower() {
		return power;
	}

	public void showAll() {
		System.out.println("Hero Name:" +name);
		System.out.println("Power:" +showPower());
	}
}

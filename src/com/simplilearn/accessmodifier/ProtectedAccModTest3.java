package com.simplilearn.accessmodifier;import java.nio.channels.ShutdownChannelGroupException;

public class ProtectedAccModTest3 extends Hero{

	public static void main(String[] args) {
		// Public Access modifier test

		// Create an object
		Hero hero = new Hero();
		hero.showAll();
		System.out.println("Hero #:" +hero.name);
		System.out.println("Power #:" +hero.power);
		System.out.println("Power #:" +hero.showPower());
	}

}

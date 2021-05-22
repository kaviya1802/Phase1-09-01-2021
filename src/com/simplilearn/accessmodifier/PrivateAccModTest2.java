package com.simplilearn.accessmodifier;import java.nio.channels.ShutdownChannelGroupException;

public class PrivateAccModTest2 {

	public static void main(String[] args) {
		// Public Access modifier test

		// Create an object
		Mother mother = new Mother();
		mother.showAll();
		
	}

}
//encapsulaion
class Mother {

	private double bankMoney= 378945.56;;
	
	private double showBankMoney() {
		return bankMoney;
	}

	public void showAll() {
		System.out.println("Bank Money:" + showBankMoney());
	}
}
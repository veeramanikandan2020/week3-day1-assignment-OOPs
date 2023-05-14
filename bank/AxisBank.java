package org.bank;

public class AxisBank extends BankInfo {
	
	//Method Overloading
	public void deposit() {
		System.out.println("Deposit limit of Axis Bank is 10L");

	}
	
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		
		ab.deposit();
	}
	
	

}

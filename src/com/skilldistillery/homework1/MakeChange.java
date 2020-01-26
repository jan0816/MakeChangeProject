package com.skilldistillery.homework1;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		System.out.println("Make Change\n");
		Scanner kb = new Scanner(System.in);

		System.out.print("Price of item: $ ");
		double price = kb.nextDouble();

		System.out.print("Amount Paid: $");
		double amountPaid = kb.nextDouble();

		if (amountPaid < price) {
			System.out.print("Not enough.");
		} else if (amountPaid > price) {
			double change = amountPaid - price;
			System.out.println("Change returned: $" + change);
			String returned = convertChange(change);
			System.out.println("Result:\n " + returned);
		} else if (amountPaid == price) {
			System.out.println("Wow, you paid exactly enough! No change for you.");
		} else {
			System.err.println("I'm sorry. I don't recognize that.");
		}
	}

	public static String convertChange(double change) {
		String moneyReturned = "";
		if (change >= 20) {
			int twenty = (int)(change/20);
			 moneyReturned = moneyReturned + twenty + " twenty dollar bill\n";  
			 change = change - (twenty*20);
		}
		if (change >= 10) {
			int ten = (int)(change/10);
			 moneyReturned = moneyReturned + ten + " ten dollar bill\n";  
			 change = change - (ten*10);
		}
		if (change >= 5) {
			int five = (int)(change/5);
			 moneyReturned = moneyReturned + five + " five dollar bill\n";  
			 change = change - (five*5);
		}
		if (change >= 1) {
			int one = (int)(change/1);
			 moneyReturned = moneyReturned + one + " one dollar bill\n";  
			 change = change - (one*1);
		}
		if (change >= 0.25) {
			int twentyFiveCent = (int)(change/.25);
			 moneyReturned = moneyReturned + twentyFiveCent + " quarter\n";  
			 change = change - (twentyFiveCent*.25);	 
		}
		if (change >= 0.10) {
			int tenCent = (int) (change/.10);
			 moneyReturned = moneyReturned + tenCent + " dime\n";  
			 change = change - (tenCent*0.10);
		}
		if (change >= 0.05) {
			int fiveCent = (int)(change/.05);
			 moneyReturned = moneyReturned + fiveCent + " nickel\n";  
			 change = change - (fiveCent*.05);
		}
		if (change >= 0.01) {
			int oneCent = (int)(change/.01);
			 moneyReturned = moneyReturned + oneCent + " penny\n";  
			 change = change - (oneCent*0.01);
		}
		return moneyReturned;
	}
}

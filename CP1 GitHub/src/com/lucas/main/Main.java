package com.lucas.main;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	//Program made by Lucas Hand
	//11/27/2018
	//Payroll Calculator
	
	static String iString, iFirstName, iLastName, oPay;
	static int cHours;
	static double cRate, cPay;
	static Scanner myScanner;
	static NumberFormat nf;
	
	public static void main (String[] args) {
		init();
		
		input();
		
		calcs();
		
		output();
		
		System.out.println("Program ending, have a good one!");
	}
	
	public static void init() {
		myScanner = new Scanner(System.in);
		myScanner.useDelimiter(System.getProperty("line.separator"));
		nf = NumberFormat.getCurrencyInstance(java.util.Locale.US);
		
	}
	
	public static void input() {
		System.out.print("Enter First Name: ");
		iFirstName = myScanner.next();
		
		System.out.print("Enter last name: ");
		iLastName = myScanner.next();
		
		try {
			System.out.print("Enter hours: ");
			iString = myScanner.next();
			cHours = Integer.parseInt(iString);
		}
		catch (Exception e) {
			System.out.println("Hours must be a whole number, defaulted to 0");
			cHours = 0;
		}
		
		try {
			System.out.print("Enter rate: ");
			iString = myScanner.next();
			cRate = Double.parseDouble(iString);
		}
		catch (Exception e) {
			System.out.println("Rate must be a decimal number, defaulted to 0");
			cRate = 0;
		}

	}
	
	public static void calcs() {
		cPay = cHours * cRate;
	}
	
	public static void output() {
		System.out.println("Name: " + iLastName + ", " + iFirstName);;
		oPay = nf.format(cPay);
		System.out.println("Pay is: " + oPay);
	}

}

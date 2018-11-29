package com.lucas.main;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	//Program made by Lucas Hand
	//11/27/2018
	//Payroll Calculator
	
	static String iString, iFirstName, iLastName, oPay;
	static int iHours;
	static double iRate, cPay;
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
		
		System.out.print("Enter hours: ");
		iString = myScanner.next();
		iHours = Integer.parseInt(iString);
		
		System.out.print("Enter rate: ");
		iString = myScanner.next();
		iRate = Double.parseDouble(iString);
	}
	
	public static void calcs() {
		cPay = iHours * iRate;
	}
	
	public static void output() {
		System.out.println("Name: " + iLastName + ", " + iFirstName);;
		oPay = nf.format(cPay);
		System.out.println("Pay is: " + oPay);
	}

}

/*
 * Modified on 1/29/2013
 * 
 * ULID: Rkhickm
 * Course: IT 168
 * Lecture section: 4
 * Instructor: Professor Matsuda
 * Lab section: 5
 * Instructor: Professor Erickson
 */

/**
 * This program gets the user's initial purchase amount and displays on screen:the initial
 * purchase amount, the state tax rate, the county tax rate, the total tax rate, and the
 * total amount of the purchase plus the total tax rate. 
 * 
 * &author Ryan Hickman
 * 
 */

//Needed for the scanner class
import java.util.Scanner;

public class SalesCalculator1 {

	public static void main (String [] args)
	{
		
		double purchase;		//To hold a name
		double state = 0.04;	//The state tax rate
		double county = 0.02;	//The county tax rate
		double purchaseState;	//To hold a name
		double purchaseCounty;	//To hold a name
		double totalSalesTax;	//To hold a name
		double totalSale;		//To hold a name
		
		//Creates a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		//Get the user's purchase amount
		System.out.print("What was your purchase total?");
		purchase = keyboard.nextDouble();
		
		purchaseState = state * purchase;				//Calculates state tax
		purchaseCounty = county * purchase;				//Calculates county tax
		totalSalesTax = purchaseState + purchaseCounty;	//Calculates total tax
		totalSale = totalSalesTax + purchase;			//Calculates total sale
		
		//Displays the user's initial purchase amount
		System.out.println("Hello, your purchase cost was: $" + purchase);
		//Displays the user's state sales tax rate
		System.out.println("The state sales tax is: $" + purchaseState);
		//Displays the user's county sales tax rate
		System.out.println("The county sales tax is: $" + purchaseCounty);
		//Displays the user's total sales tax rate for their area
		System.out.println("The total sales tax is: $" + totalSalesTax);
		//Displays the overall total of the user's purchase
		System.out.println("Your sale total comes out to: $" + totalSale);
		
	
				
	}

}

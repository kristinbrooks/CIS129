/**
* Airline_v2.java - This program determines if an airline passenger is 
* eligible for a 20% discount. 
* Date created: 9/27/2017
* Authors: J. A. Smith, O. Samuel-Ojo
*/

import javax.swing.*;

public class Airline_v2 
{
	public static void main(String args[]) 
	{
		String passengerName = ""; 	// Passenger's name.
		String ageString = "";          // String version of passenger's age.
		int passengerAge = 0; 	// Passenger's age.

		// This is the work done in the housekeeping() method
		passengerName = JOptionPane.showInputDialog("Enter passenger's name: ");
		ageString = JOptionPane.showInputDialog("Enter passenger's age: ");
		
		passengerAge = Integer.parseInt(ageString);
		
		// Check for input errors. For example, check for negative age condition.
		if (passengerAge < 0) {
			
			// print the age and a message alerting an invalid age.
			System.exit(0);
			
		}

		// Test to see if this customer is eligible for a 20% discount. 
				
		
		System.exit(0);
	}

} 


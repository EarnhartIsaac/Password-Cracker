/********************************************
* AUTHOR: Isaac Earnhart
* COURSE: CS 111 Intro to CS I
* SECTION: MTh 1:00pm-5:20pm
* LAST MODIFIED: 8/3/2016
********************************************/
/*****************************************************************************
* PassCrack
*****************************************************************************
* PROGRAM DESCRIPTION:
* Brute Forces passwords with given hashes 
*****************************************************************************
* ALGORITHM:
* DECLARE keyboard: Scanner
* DECLARE cracker: SimpleHash
* DECLARE joe: Individual
* INITIALIZE keyboard: new Scanner System.in
* INITIALIZE cracker: new SimpleHash
* INITIALIZE joe: new Individual
* CALL Interface.printStart
* CALL Interface.readIndiviual joe,keyboard
* CALL Interface.crackSettings cracker,keyboard
* DECLARE result: String
* OUTPUT "Calculating..."
* result is cracker.bruteforce joe
* CALL joe.setPassword result
* OUTPUT joe
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* java.util.Scanner used for console input
*****************************************************************************/

import java.util.Scanner;

public class PassCrack
{	
	public static void main(String[] args)
	{	
		/** DECLARATIONS **/
		Scanner keyboard;
		SimpleHash cracker;
		Individual joe;
		String result;
		
		/** INITIALIZATIONS **/
		keyboard = new Scanner(System.in);
		cracker = new SimpleHash();
		joe = new Individual();
		
		/** INPUTS **/
		Interface.printStart();
		Interface.readIndividual(joe,keyboard);
		Interface.crackSettings(cracker,keyboard);
		
		/** CALCULATIONS **/
		System.out.println("Calculating...");
		result = cracker.bruteForce(joe);
		joe.setPassword(result);
		
		/** OUTPUT **/
		System.out.println(joe);
		
	}
}

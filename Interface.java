/********************************************
* AUTHOR: Isaac Earnhart
* COURSE: CS 111 Intro to CS I
* SECTION: MTh 1:00pm-5:20pm
* LAST MODIFIED: 8/3/2016
********************************************/
/*****************************************************************************
* Interface
*****************************************************************************
* PROGRAM DESCRIPTION:
* Output and Input methods to simplify the usage of HashAlgorithms and 
* Individual classes
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* java.util.Scanner, java.io.FileInputStream,java.io.FileNotFoundException
*  used for console input
*****************************************************************************/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Interface
{
	// DESCRIPTION: Prints program graphic screen
	// PRE-CONDITION: startscreen.txt exists within program directory
	// POST-CONDITION: Outputs startscreen.txt onto the screen
	public static void printStart()
	{
		Scanner inputStream = null;
		try
		{
			inputStream = new Scanner(new FileInputStream("startscreen.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File startscreen.txt was not found");
			System.out.println("or could not be opened.");
			System.exit(0);
		}
		while(inputStream.hasNextLine())
		{
			System.out.println(inputStream.nextLine());
		}
		inputStream.close();
	}
	
	// DESCRIPTION: 	Gathers data from the user on instance variables
	//					of an object Individual
	// PRE-CONDITION:	victim and keyboard have been instantiated
	// POST-CONDITION:	Instance variables username and hash have been
	//					set to values by the user
	public static void readIndividual(Individual victim,Scanner keyboard)
	{
		System.out.println("Individual's data");
		System.out.print("Please enter Individual's username: ");
		victim.setUsername(keyboard.nextLine());
		System.out.print("Please enter Individual's hashed password: ");
		victim.setHash(keyboard.nextLine());
	}
	
	// DESCRIPTION: 	Gathers data from the user on instance variables
	//					of an object HashAlgorithms
	// PRE-CONDITION:	cracker and keyboard have been instantiated
	// POST-CONDITION:	All instance variables within cracker have been
	//					set to values from the user
	public static void crackSettings(HashAlgorithms cracker,Scanner keyboard)
	{
		System.out.println("Cracker settings");
		cracker.setMinCharacters(Cs111.readInt("Please enter minimum password length: ",
												keyboard,
												1));
		cracker.setMaxCharacters(Cs111.readInt("Please enter maximum password length: ",
												keyboard,
												cracker.getMinCharacters()));
												
		switch (Cs111.readChar("Include capitals?(Y/N): ",keyboard,"YyNn"))
		{
			case 'Y':
			case 'y':
				cracker.setCapitalNeeded(true);
				break;
			case 'N':
			case 'n':
				cracker.setCapitalNeeded(false);
				break;
		}
		switch (Cs111.readChar("Include numbers?(Y/N): ",keyboard,"YyNn"))
		{
			case 'Y':
			case 'y':
				cracker.setNumberNeeded(true);
				break;
			case 'N':
			case 'n':
				cracker.setNumberNeeded(false);
				break;
		}
		switch (Cs111.readChar("Include symbols?(Y/N): ",keyboard,"YyNn"))
		{
			case 'Y':
			case 'y':
				cracker.setSymbolNeeded(true);
				break;
			case 'N':
			case 'n':
				cracker.setSymbolNeeded(false);
				break;
		}
	}
}

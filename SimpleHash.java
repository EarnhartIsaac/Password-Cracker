/********************************************
* AUTHOR: Isaac Earnhart
* COURSE: CS 111 Intro to CS I
* SECTION: MTh 1:00pm-5:20pm
* LAST MODIFIED: 8/3/2016
********************************************/
/*****************************************************************************
* SimpleHash
*****************************************************************************
* PROGRAM DESCRIPTION:
* Derivative of HashAlgorithms using a different hash method
*****************************************************************************/

public class SimpleHash extends HashAlgorithms
{
	
	/** NECESSARY METHODS **/
	// DESCRIPTION:		Returns string representation of object
	// PRE-CONDITION:	Instance variables have valid values
	// POST-CONDITION:	Returns string with all instance variables
	public String toString()
	{
		return "Minimum Characters: " + minCharacters +
			   "\nMaximum Characters: " + maxCharacters +
			   "\nSymbol Needed: " + symbolNeeded +
			   "\nNumber Needed: " + numberNeeded +
			   "\nCapital Needed: " + capitalNeeded;
	}
	
	/** SETTERS / MUTATORS **/
	
	// DESCRIPTION: set minCharacters to desired value with error checking
	// PRE-CONDITION: minCharacters cannot be less than or equal to zero
	//	 			  and should not be greater than maxCharacters
	// POST-CONDITION: returns false if minCharacters is less than or
	//				   equal to zero
	public boolean setMinCharacters(int minCharacters)
	{
		if (minCharacters > 0)
		{
			this.minCharacters = minCharacters;
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	// DESCRIPTION: set maxCharacters to desired value with error checking
	// PRE-CONDITION: maxCharacters cannot be less than or equal to zero
	//				 and should not be less than minCharacters
	// POST-CONDITION: returns false if maxCharacters is less than or
	//				   equal to zero
	public boolean setMaxCharacters(int maxCharacters)
	{
		if (maxCharacters > 0)
		{
			this.maxCharacters = maxCharacters;
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	// DESCRIPTION: set symbolNeeded to true or false
	// PRE-CONDITION: symbolNeeded is a valid boolean
	// POST-CONDITION: instance variable symbolNeeded becomes
	//				   argument symbolNeeded
	public void setSymbolNeeded(boolean symbolNeeded)
	{
		this.symbolNeeded = symbolNeeded;
	}
	
	// DESCRIPTION: set numberNeeded to true or false
	// PRE-CONDITION: numberNeeded is a valid boolean
	// POST-CONDITION: instance variable numberNeeded becomes
	//				   argument numberNeeded
	public void setNumberNeeded(boolean numberNeeded)
	{
		this.numberNeeded = numberNeeded;
	}
	
	// DESCRIPTION: set capitlNeeded to true or false
	// PRE-CONDITION: capitalNeeded is a valid boolean
	// POST-CONDITION: instance variable capitalNeeded becomes
	//				   argument capitalNeeded
	public void setCapitalNeeded(boolean capitalNeeded)
	{
		this.capitalNeeded = capitalNeeded;
	}
	
	// DESCRIPTION: set all instance variables to desired values
	// PRE-CONDITION: valid data entered as arguments
	// POST-CONDITION: returns false if either minCharacters or 
	//				   maxCharacters less than or equal to zero
	public boolean setAll(int minCharacters,
						  int maxCharacters,
						  boolean symbolNeeded,
						  boolean numberNeeded,
						  boolean capitalNeeded)
	 {
		this.setSymbolNeeded(symbolNeeded);
		this.setNumberNeeded(numberNeeded);
		this.setCapitalNeeded(capitalNeeded);
		return (this.setMinCharacters(minCharacters) &&
				this.setMaxCharacters(maxCharacters));

	 }
	 
	 /** CONSTRUCTORS **/
	 
	 // DESCRIPTION: creates an object and sets its instance variables
	 //				 to the constructor arguments
	 // PRE-CONDITION: arguments are valid data
	 // POST-CONDITION: Exits program if minCharacters or maxCharacters
	 //					are less than or equal to zero
	 public SimpleHash(int minCharacters,
						  int maxCharacters,
						  boolean symbolNeeded,
						  boolean numberNeeded,
						  boolean capitalNeeded)
	{
		super(minCharacters,
					maxCharacters,
					symbolNeeded,
					numberNeeded,
					capitalNeeded);

	}
	
	 // DESCRIPTION: creates an object and sets its instance variables
	 //				 to Class Default constants
	 // PRE-CONDITION: arguments are valid data
	 // POST-CONDITION: Exits program if minCharacters or maxCharacters
	 //					are less than or equal to zero
	public SimpleHash()
	{
		this(DEFAULT_MINCHAR,
			 DEFAULT_MAXCHAR,
			 DEFAULT_SYMBOL_NEEDED,
			 DEFAULT_NUMBER_NEEDED,
			 DEFAULT_CAPITAL_NEEDED);
	}
	
	 // DESCRIPTION: creates an object deep copy of SimpleHash object copy
	 // PRE-CONDITION: copy is instantiated and not null
	 // POST-CONDITION: Exits program if minCharacters or maxCharacters
	 //					are less than or equal to zero or if copy is null
	public SimpleHash(SimpleHash copy)
	{
		if (copy != null)
		{
			if(!setAll(copy.minCharacters,
					copy.maxCharacters,
					copy.symbolNeeded,
					copy.numberNeeded,
					copy.capitalNeeded))
			{
				System.out.println("ERROR: invalid values for SimpleHash constructor");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("ERROR: attempting to copy null HashAlgorithm");
			System.exit(0);
		}
			
	}
	
	// DESCRIPTION: Checks to see if instance variables of Object 
	//				copy are equal to this objects instance variables
	// PRE-CONDITION: Object copy is instantiated and this object is 
	//				  instantiated
	// POST-CONDITION: Returns a boolean true if the instance variables
	//				   of both objects are equal
	public boolean equals(Object copy)
	{
		SimpleHash cracker;
		cracker = (SimpleHash)copy;
		return (cracker.minCharacters == this.minCharacters &&
					cracker.maxCharacters == this.maxCharacters &&
					cracker.symbolNeeded == this.symbolNeeded &&
					cracker.numberNeeded == this.numberNeeded &&
					cracker.capitalNeeded == this.capitalNeeded); 
	}
	
	/** GETTERS **/
	
	// DESCRIPTION: Gets minCharacters value
	// PRE-CONDITION: Object has valid minCharacters value
	// POST-CONDITION: Returns value of minCharacters
	public int getMinCharacters()
	{
		return this.minCharacters;
	}
	
	// DESCRIPTION: Gets maxCharacters value
	// PRE-CONDITION: Object has valid maxCharacters value
	// POST-CONDITION: Returns value of maxCharacters
	public int getMaxCharacters()
	{
		return this.maxCharacters;
	}
	
	// DESCRIPTION: Gets symbolNeeded value
	// PRE-CONDITION: Object has valid symbolNeeded value
	// POST-CONDITION: Returns value of symbolNeeded
	public boolean getSymbolNeeded()
	{
		return this.symbolNeeded;
	}
	
	// DESCRIPTION: Gets numberNeeded value
	// PRE-CONDITION: Object has valid numberNeeded value
	// POST-CONDITION: Returns value of numberNeeded
	public boolean getNumberNeeded()
	{
		return this.numberNeeded;
	}

	// DESCRIPTION: Gets capitalNeeded value
	// PRE-CONDITION: Object has valid capitalNeeded value
	// POST-CONDITION: Returns value of capitalNeeded
	public boolean getCapitalNeeded()
	{
		return this.capitalNeeded;
	}
	
	//DESCRIPTION: Hash function for the SimpleHash class
	//		 	   overriding the default hash in HashAlgorithms
	//PRECONDITIONS: password is a valid String
	//POSTCONDITIONS: Hashed String is returned
	public String hash(String password)
	{
		String sum;
		sum = "";
		for(int counter = 0;counter < password.length();counter++)
		{
			sum = sum + (char)(password.charAt(counter) + 1);
		}
		return sum;
	}
	
}

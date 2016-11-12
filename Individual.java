/********************************************
* AUTHOR: Isaac Earnhart
* COURSE: CS 111 Intro to CS I
* SECTION: MTh 1:00pm-5:20pm
* LAST MODIFIED: 8/3/2016
********************************************/
/*****************************************************************************
* Individual
*****************************************************************************
* PROGRAM DESCRIPTION:
* Tools to store an individuals username, password, and password hashes
*****************************************************************************/

public class Individual
{
	public static final String UNKNOWN_HASH =  "Unknown";
	public static final String UNKNOWN_PASSWORD = "Unknown";
	
	private String username;
	private String hash;
	private String password;
	
	// DESCRIPTION:		Returns string representation of object
	// PRE-CONDITION:	All Instance variables have valid values
	// POST-CONDITION:	Returns string with all instance variables
	public String toString()
	{
		return String.format("%-20s%-1s%n%-20s%-1s%n%-20s%-1s%n",
							 "Username: ",this.username,
							 "Hashed Password: ",this.hash,
							 "Password: ",this.password);
	}
	
	// DESCRIPTION:		Sets instance variable username to a value
	// PRE-CONDITION: 	argument username is a valid String
	// POST-CONDITION:	this object's username is set to argument username
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	// DESCRIPTION:		Sets instance variable hash to a value
	// PRE-CONDITION: 	argument hash is a valid String
	// POST-CONDITION:	this object's hash is set to argument hash
	public void setHash(String hash)
	{
		this.hash = hash;
	}
	
	// DESCRIPTION:		Sets instance variable password to a value
	// PRE-CONDITION: 	argument password is a valid String
	// POST-CONDITION:	this object's password is set to argument password
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	// DESCRIPTION: 	Sets all instance variables in object
	// PRE-CONDITION:	Set password parameter to NULL if no password known,
	//					all 3 arguments are valid Strings
	// POST-CONDITION:	this object's instance variables are set to these
	//					three arguments
	public void setAll(String username,String hash,String password)
	{
		this.setUsername(username);
		this.setHash(hash);
		this.setPassword(password);
	}
	
	// DESCRIPTION: 	creates an object and sets its instance variables
	//				 	to the constructor arguments
	// PRE-CONDITION:	arguments are valid data
	// POST-CONDITION:	this object's instance variables are set to these
	//					three arguments
	public Individual(String username,String hash,String password)
	{
		this.setAll(username,hash,password);
	}
	
		
	// DESCRIPTION: 	creates an object and sets its instance variables
	//				 	all to "Unknown"
	// PRE-CONDITION:	argument are valid data
	// POST-CONDITION:	this object's instance variables are set to these
	//					three arguments
	public Individual()
	{
		String usedName;
		usedName = "";
		switch((int)Math.floor(Math.random() * 3))
		{
			case 0:
				usedName = "Joe Smith";
				break;
			case 1:
				usedName = "John Doe";
				break;
			case 2:
				usedName = "Michael Jordan";
				break;
		}
		this.setAll(usedName,UNKNOWN_HASH,UNKNOWN_PASSWORD);
	}

	// DESCRIPTION: 	creates an object and sets its instance variables
	//				 	to the instance variables of object copy
	// PRE-CONDITION:	copy is not null
	// POST-CONDITION:	this object's instance variables are set to these
	//					three arguments
	public Individual(Individual copy)
	{
		if (copy != null)
		{
			this.setAll(copy.username,
					copy.hash,
					copy.password);
		}
		else
		{
			System.out.println("ERROR: try to copy a null object Individual");
			System.exit(0);
		}
	}
	
	// DESCRIPTION: 	Checks to see if instance variables of Object 
	//					copy are equal to this objects instance variables
	// PRE-CONDITION:	Object copy is instantiated and this object is 
	//				  	instantiated
	// POST-CONDITION:  Returns a boolean true if the instance variables
	//				   	of both objects are equal
	public boolean equals(Object other)
	{
		Individual copy;
		copy = (Individual)other;
		return copy.username.equals(this.username) &&
			   copy.hash.equals(this.hash) &&
			   copy.password.equals(this.password);
	}
	
	// DESCRIPTION: Gets username value
	// PRE-CONDITION: Object has valid username value
	// POST-CONDITION: Returns value of username
	public String getUsername()
	{
		return this.username;
	}
	
	// DESCRIPTION: Gets hash value
	// PRE-CONDITION: Object has valid hash value
	// POST-CONDITION: Returns value of hash
	public String getHash()
	{
		return this.hash;
	}
	
	// DESCRIPTION: Gets password value
	// PRE-CONDITION: Object has valid password value
	// POST-CONDITION: Returns value of password
	public String getPassword()
	{
		return this.password;
	}

}



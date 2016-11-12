# Password-Cracker
Bare bones brute force password cracking program/password cracking tools

*Due to CS111 programming guidelines this program does not implement certain programming practices that 
are not covered within CS111 that would be more suited for this project such as recursive functions
for the cracking algorithm*

Condensed notes on usage
- To add new hashing algorithms to the program create a subclass for the algorithm out of superclass HashAlgorithms
  * The method hash in HashAlgorithms should be overriden in your new class with your new algorithm
  * SimpleHash is an example of a subclass of HashAlgorthims and how new subclasses should look
  * SimpleHash is not actually a hash but only an encryption
- Interface contains methods to give the program simple console io capabilities
  * Interface is not necessary for computation and password cracking and should be deleted or replaced if user is not using console io
  * Interface is comically not an interface
- Individual stores all data of individual being cracked including username, password hash, and password
- Cs111 is a class that adds in error checking to user input
- PassCrack is an example of these classes being used together to crack a user entered password


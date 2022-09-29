//Import Statements
import java.util.Scanner; 
import java.util.Stack;

/**
 * This is a program that makes a Palindrome object that accepts a String from the user, pushes it into a stack to test if the String is a palindrome
 * @author Matt Rice
 * @version 09/22/22
 * Palindrome
 * Fall 2022
 */
 
public class Palindrome {
	
	//Instance variables
	private String input;//String that will be inputted by the user and will be pushed into a stack as Characters
	private Scanner scan= new Scanner(System.in);//Scanner that will scan the String input
	private Stack<Character> stack;//Stack that will be for the palindrome
	 
	/**
	 * Constructor that allows the user to input a String, it will convert the String into Characters and push them into a Stack.
	 * 
	 */
	public Palindrome(){
		//Asks the user to enter a Palindrome
		System.out.println("Please enter a Palindrome");
		//Allows the user to type in a string value for input
		input=scan.nextLine();
		//Removes all of the spaces in input to make it easier to push into a stack
		input=input.replaceAll("\\s", "");
		//Makes all of the characters in the string lowercase to make it able to read capitalized palindromes
		input=input.toLowerCase();
		
		//Instantiates a stack object that will be used to test palindromes
		stack=new Stack<Character>();
		//Creates a character object that will be pushed into the stack
		Character letter = null;
		 
		//For loop that will push the charcters of the String into the stack
		for(int i=0; i<input.length(); i++) {
					letter= input.charAt(i);
					stack.push(letter);	
		}//end for
	}//end Palindrome
	/**
	 * Checks to see if the value of the Palindrome object is actually a Palindrome
	 * @return true if it is a Palindrome and false if it is not a Palindrome
	 */
	public boolean testPalindrome() {
		//Used to iterate through the String
		int j=0;
		//Stops the loop and returns true or false depending on if they're Palindromes
		boolean go=true;
		//Pops the Character from the stack and compares it to the characters of the string
		Character tempCharacter=null;
		//While loop that will compare the characters of the stack with the characters in the string
		while(go==true&&stack.isEmpty()==false) {
			tempCharacter=stack.pop();
			//checks to see if the character in the stack equals string character and iterates through if it does
			if(tempCharacter==input.charAt(j)) {
				j++;
			}//end if
			//If the characters don't equal then go is false, while ends and returns false
			else if(tempCharacter!=input.charAt(j)) {
				go=false;
			}//end else if(I did else if because it made me more comfortable than else
			}//end while loop
		
		//returns whether the palindrome is true or false
		return go;
	}//end testPalindrome()
		
}//end class Palindrome
	
	



/**
 * This class is used to reverse a given string
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 4
 * SP/2020
 * 
 */

package jsjf;
import java.util.Scanner;

public class Application
{

	@SuppressWarnings("unchecked")
	/**
	 * Accepts a string as a parameter and reverses it using a stack.
	 * @param A string that will be reversed
	 * @return A reversed string
	 */
	public static String reverseString(String s)
	{
		
		ArrayStack stack = new ArrayStack();

		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++)
			stack.push(ch[i]);
		
		int top = 0;

		while (!stack.isEmpty())
		{
			ch[top++] = (char) stack.pop();
		}

		return String.copyValueOf(ch);
	}

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String a = "";
		do { 
			System.out.print("Type a sentence: ");
			String str = scan.next();
		
			str = reverseString(str); //Reverses the given string

			System.out.println("Reverse: " + str); //Prints out the reversed string
			System.out.println("Would you like to enter another sentence?"); //Asks the user if they would like to enter another sentence
			a = scan.next();
		}
		while(a.equals("Y"));
		System.out.println("<Goodbye>");
	}
}
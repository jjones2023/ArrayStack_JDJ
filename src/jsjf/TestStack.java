/**
 * 
 * This class is used to test all the methods of ArrayStack.java
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 4
 * SP/2020
 * 
 */

package jsjf;

public class TestStack {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		
		ArrayStack stack = new ArrayStack(); //Creates a new array-based stack.
		stack.push(10); //Adds the integer 10 to the stack
		stack.pop(); //Removes the integer 10 from the stack
		stack.size(); //Returns the size of the stack
		stack.push(20); //Adds the integer 20 to the stack
		stack.push(100); //Adds the integer 100 to the stack
		stack.peek(); //Looks at the top number of the stack. Would be 100 in this case
		stack.toString(); //Prints the current values of the stack.
	}
}
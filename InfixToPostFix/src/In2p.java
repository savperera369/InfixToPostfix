// Infix to PostFix Converter Program
// Created by Saviru Perera - 260966369
// The code for the println statement
// at the start was taken from ECSE 202 Assignment 3 pdf

import acm.program.*;

public class In2p extends ConsoleProgram {
	
	postFix a = new postFix(); // creates instance of postFix class
	
	public void run() {
		
		// Instructs user how to terminate program
		println("Infix to PostFix conversion, enter expression of blank line to exit.");
		
		// while loop runs until blank line entered
		while(true) {
			String infix = readLine("\nEnter an infix expression: "); // prompts user for input
			if (infix.equals("")) {
				println("Program Terminated"); 
				break; // program terminated if blank line entered
			}
			
			Queue pFix = a.In2Post(a.parse(infix)); // variable pFix of type Queue holds postFix expression in queue
			println("" + infix + " ==> " + pFix.toString() + "\n"); // displays pFix queue in a string
			
			
		}
		
	}
	
}

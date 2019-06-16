package practice;

import java.util.Scanner;

public class StringCharCount {

	

	public static void main(String[] args) {

	    double scores;
	   

	    // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);

	    do {
	        // ask user for input
	        System.out.print("Enter Score: ");
	        scores = keyboard.nextDouble();


	    } while (scores != -1);

	    // close scanner
	    keyboard.close();
	    double average=(scores++)/scores;
	        System.out.println("scores" +average );
	    }
	
	}
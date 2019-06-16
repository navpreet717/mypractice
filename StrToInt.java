package practice;

import java.util.Scanner;

public class StrToInt {

public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter your numbers, separated by commas");
  String userInput = keyboard.nextLine();
  
  int total = sumNumbers(userInput);
  System.out.println("The total is: " + total);
}

public static int sumNumbers(String n) {
  
  // Create a variable to keep track of the total
  int total = 0;
  
  // Loop through each letter in the sentence
  // If you see a "," then do nothing
  // If you do NOT see a "," then you must have a number!
  for (int i = 0; i < n.length(); i++) {
    char currentCharacter = n.charAt(i);
    if (currentCharacter == ',') {
      // do nothing! it's a comma!
    } else {
      // you must have found a number!
      // ------------
      // 1. Convert the character back to a string
      // This conversion is necessary because the Integer.parseInt 
      // function accepts Strings, not chars
      String x = Character.toString(currentCharacter);
      
      // 2. Convert the string into an integer
      int number = Integer.parseInt(x);
      
      // 3. Add the integer to the overall total
      total = total + number;
    }
  } // end for-loop

  // 4. Done the calculations, so return the total 
  return total;
}}
package practice;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = keyboard.nextLine();

		char[] letters = word.toCharArray();

		for (int i = (letters.length)-1; i >=0; i--) {
		    System.out.println(letters[i]);
		}
	}

}

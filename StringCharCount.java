package practice;

import java.util.Scanner;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		int numberofcharactrs=str.length();
		System.out.println("number of characters:"+numberofcharactrs);


		//the number of times  c appear in the sentence 
		int charCount = 0;
        for(int i =0 ; i<str.length(); i++){
            if(str.charAt(i) == 'e'){
                charCount++;
                System.out.println("number of times e appear"+charCount);
            }


	}

}}
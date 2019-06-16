package practice;
import java.util.Scanner;

public class ReverseString {



	 
	
	    public static void main(String[] args)
	    {
	
	    	
	        String str1 = "navu";
	        System.out.println("Reverse string is   "+countWords(str1) );   
	         

	        
	    }
	        static String countWords(String str)  
	        {

	        String reverse = "";
	        
	        
	        for(int i = str.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + str.charAt(i);
	        }
	        return reverse;
	        
	  
}}



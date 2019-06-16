package practice;

import java.util.Scanner;

public class CountWords {


	   
    static int countWords(String string)  
      {  
        int count=0;  
    
          char ch[]= new char[string.length()];     //array declaration
          for(int i=0;i<string.length();i++)  
          {  
              ch[i]= string.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
          }  
          return count;  
      }  
    public static void main(String[] args) {  
        String string =" today is friday  ";  
       System.out.println(string+"contains "+countWords(string) + "words");   
         
        String string1 =" pen pine apple apple pen  ";  
       System.out.println(string+"contains "+countWords(string1) + " words.");
       
         
        String string2 =" boop  ";  
       System.out.println(string+"contains "+countWords(string2) + " words.");   
         
        String string3 =" today is friday  ";  
       System.out.println(string+"contains "+countWords(string3) + " words.");   
  
  
  
  }  
}  

package practice;

import java.util.Scanner;

public class Bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter sales");
		int sales=s.nextInt();
		
int stars=sales/100;
for(int i=0;i<stars;i++)
{
	System.out.print("*");

	}


}}

package practice;
public class FractionSum {



 
			  public static void main (String[] args) 
			 {
			    double sum = 0;
			 
			    for (double x = 1, y = 30; x <= 30 && y >= 1; x++, y--)
			    {

			    sum += (x/y);
			    }
			 
			    System.out.println("The sum of the series of numbers is " + sum);
			 }
			}




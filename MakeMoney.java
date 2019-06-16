package practice;

public class MakeMoney {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			System.out.println("Number of days you will work");
			int days=5;
			
			//declare variable
			double total=0;
			//calculate some dollars
			
			for(int i=1;i<=days;i++)
			
			{
				//calculate how much you make today
				
				double salaryToday= Math.pow(2,i-1);
				System.out.println("Money on day:"+i+":"+salaryToday);

				//how much money u made in toTAL
				total=total+salaryToday;
				System.out.printf("\t Total so far:$ %.1f \n",total);
				
			}


	}

}

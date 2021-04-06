package lab5;

import java.util.Scanner;

public class Prog3 {
	 static int salary;
	
	public static void main(String[] args)  {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary ");
		salary=sc.nextInt();
		try
		{
			if(salary<3000)
			{
				throw new MinimumSalaryException("Salary is below 3000");
			} 
			else
			{
				System.out.println("Salary "+salary);
			}
			
		}
		catch(MinimumSalaryException e) {
			e.printStackTrace();
		}
	}

}

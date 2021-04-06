package lab5;

import java.util.Scanner;

public class Prog1 {

	static int age;
	
	public static void main(String[] args)  {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age ");
		age=sc.nextInt();
		try
		{
			if(age<15)
			{
				throw new MinimumAgeException("Age is below 15");
			} 
			else
			{
				System.out.println("Age "+age);
			}
			
		}
		catch(MinimumAgeException e) {
			e.printStackTrace();
		}
	}
			
}

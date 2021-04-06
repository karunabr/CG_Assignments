package lab1;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int n;
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			a=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					a=1;
				}
				
			}
			if(a==0)
				System.out.println(i);
		}

	}

}

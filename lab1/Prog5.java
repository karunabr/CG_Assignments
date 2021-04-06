package lab1;

import java.util.Scanner;

public class Prog5 {

		 int calculateSum(int n) {
			int sum = 0;
			for (int i=1;i<=n;i++)
			{
				if (i%3==0 || i%5==0) 
					sum += i;
			}

			return sum;
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n value ");
			int n=sc.nextInt();
			Prog5 p=new Prog5();
			System.out.println(p.calculateSum(n));
		}

	}


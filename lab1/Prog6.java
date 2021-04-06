package lab1;

import java.util.Scanner;

public class Prog6 {

	int calculateDifference(int n) {
		int difference=0, square=0, sumOfSquare=0;
		for (int i=1;i<=n;i++) 
		{
			sumOfSquare += i;
			square += i*i;
			
		}
		
		//sumSquare=Math.sqrt(sumSquare);
		sumOfSquare *= sumOfSquare;
		//difference = Math.abs(sumSquare - sumSquare);
		difference = square-sumOfSquare;
		System.out.println("Difference is "+difference);
		return difference;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=sc.nextInt();
		Prog6 p=new Prog6();
		p.calculateDifference(n);
	}

	}



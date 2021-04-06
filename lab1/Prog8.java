package lab1;

import java.util.Scanner;

public class Prog8 {

	public boolean checkNumber(int n)
	{
		boolean flag=false;
		while(n>1)
		{
			n=n/2;
			if(n%2==0)
				flag=true;
			else
				flag=false;
			
		}
		if(flag)
		{
			System.out.println("Number is a power of 2");
		}
		else
		{
			System.out.println("Number is not a power of 2");

		}
		return flag;
	}
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		num=sc.nextInt();
		Prog8 p=new Prog8();
		p.checkNumber(num);
	}

}

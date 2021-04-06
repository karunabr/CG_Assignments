package lab1;

import java.util.Scanner;


public class Prog7 {
	 boolean checkNumber(int n)
	 {
	 	int n1;
	 	boolean flag=false;
	 	n1=n%10;
	 	n=n/10;
	 	while(n>0)
	 	{
	 		if(n1>=n%10)
	 		{
	 			flag=true;
	 		}
	 		else
	 		{
	 			flag=false;
	 		}
	 		n1=n%10;
	 		n=n/10;
	 	}
	 	if(true)
	 	{
	 		System.out.println("Number is in increasing order");
	 	}
	 	else
	 		System.out.println("Number is not in increasing order");
	 	
		return flag;
	 }

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		num=sc.nextInt();
		Prog7 p=new Prog7();
		p.checkNumber(num);
		

	}

}

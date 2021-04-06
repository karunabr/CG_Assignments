package lab2;

import java.util.Scanner;

public class Prog1 {
	public int getSecondSmallest() {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array ");
		n=sc.nextInt();
		System.out.println("Enter the elements in array ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		System.out.println("Second smallest number in a given array is "+a[1]);
		return a[1];
	}
	public static void main(String[] args) {
		Prog1 p=new Prog1();
		p.getSecondSmallest();
	}

}

package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Prog3 {
	public int getSorted(int a[],int n)
	{
		int s=n;
		System.out.print("Reversed array ");	
		for(int i=0;i<n/2;i++)
		{ 
			int temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		System.out.print(Arrays.toString(a));
			
		System.out.print("\nArray after sorting ");
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(a));
		return 1;
	}

	public static void main(String[] args) {
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
		Prog3 p=new Prog3();
		p.getSorted(a,n);

	}

}

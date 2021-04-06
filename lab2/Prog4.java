package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Prog4 {
	
	public static int[] modifyArray(int[] array) {
		int j=0;
		int[] result= new int[array.length];
		Arrays.sort(array);
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				array[j]=array[i];
				j++;
			}
		}
		array[j]=array[array.length-1];
		
		for(int i=j;i>=0;i--) {
			System.out.print(array[i]);
		}
	return result;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array ");
		int n=sc.nextInt();
		System.out.println("Enter the elements in array ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		modifyArray(a);
		
	}

}

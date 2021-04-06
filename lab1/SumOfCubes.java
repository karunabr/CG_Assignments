package lab1;
import java.util.*;

public class SumOfCubes {

	void cubeValue()
	{
		int sum=0,n; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		n=sc.nextInt();
		while(n>0)
		{
			int d=n%10;
			n=n/10;
			sum+=d*d*d;
			
		}
		System.out.println("Sum "+sum);
		
	}
	public static void main(String[] args) {
		SumOfCubes s=new SumOfCubes();
		s.cubeValue();
		

	}

}

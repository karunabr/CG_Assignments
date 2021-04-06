package lab1;
import java.util.*;
public class Fibonacci {
	
	void fibNonRecursive(int a, int b, int c, int num)
	{	
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<num;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	void fibRecursive(int a, int b, int c, int num)
	{
		
		if(num>0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			fibRecursive(a,b,c,num-1);
		}
		
		
	}

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=sc.nextInt();
		Fibonacci f=new Fibonacci();
		System.out.println("nth value in the series using non recursive function is" );
		f.fibNonRecursive(a,b,c,n);
		System.out.println("nth value in the series using recursive function is" );
		System.out.println(a);
		System.out.println(b);
		f.fibRecursive(a,b,c,n-2);

	}

}

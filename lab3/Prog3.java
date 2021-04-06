package lab3;

import java.util.Scanner;

public class Prog3 {
	public static String alterString(String s)
	{
		StringBuffer sb=new StringBuffer();
		char ch[]=s.toCharArray();
		for(char j:ch) 
		{
			if(j=='a' || j=='e' || j=='i' || j=='o' || j=='u')
			{
				sb.append(j);
			}
			else
			{
				sb.append((char) (j+1));
			}
		}
		System.out.println(sb);
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a string ");
		String s=sc.nextLine();
		alterString(s);
	}

}

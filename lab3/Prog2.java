package lab3;

import java.util.Scanner;

public class Prog2 {
	public static String getImage()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		String rev = sb.reverse().toString();
		System.out.println(s+"||"+rev);
		return rev;
	}

	public static void main(String[] args) {
		getImage();
	}

}

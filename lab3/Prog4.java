package lab3;

import java.util.Scanner;

public class Prog4 {
	public static int modifyNumber(int n)
	{
			StringBuffer sb=new StringBuffer();
			String s=Integer.toString(n);
			for (int i=0;i<s.length()-1;i++) {
				int difference=(int)(s.charAt(i)-s.charAt(i + 1));
				sb.append(Math.abs(difference));
			}
			sb.append((int)Math.abs(s.charAt(s.length()-1)-s.charAt(0)));
			return Integer.parseInt(sb.toString());
		}

		public static void main(String[] args) {
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number ");
			num=sc.nextInt();
			System.out.println(modifyNumber(num));
		}


	}

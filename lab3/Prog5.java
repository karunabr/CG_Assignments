package lab3;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		int sentence=1,word=1,letter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(char i:ch) 
		{
			letter++;
			if(i=='\n')
				sentence++;
			if(i==' ')
				word++;
		}
		System.out.println("Letters "+letter);
		System.out.println("Word "+word);
		System.out.println("Sentance "+sentence);
		
		
	}

}

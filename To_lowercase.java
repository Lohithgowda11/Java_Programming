package programming;

import java.util.Scanner;

public class To_lowercase 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String in upper case..........");
		String str = sc.nextLine();
		String ans="";
		for (int i = 0; i < str.length(); i++)
		{
			char ch =str.charAt(i);
			int x=(int)ch;
			ans=ans+(char)(x+32);
			
		}
		System.out.println("To lower case......"+ans);
		
	}

}

package programming;

import java.util.Scanner;

public class Count_no_of_lowercase 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String......");
		String str= sc.nextLine();
		int count=0;
		for (int i = 0; i < str.length(); i++)
		{
			char ch =str.charAt(i);
			if(ch>='a'&&ch<='z')
				count++;
			
		}
		System.out.println("The number of lower case in a string is "+count);
	}

}

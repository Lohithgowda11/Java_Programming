package programming;

import java.util.Scanner;

public class string_topic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str= sc.nextLine();
		String[] arr = str.split(" ");
		String ans = "";
		String rev;
		for (int i = 0; i < arr.length; i++) 
		{
			rev="";
			for (int j = arr[i].length()-1; j >=0; j--)
			{
				rev=rev+arr[i].charAt(j);
				
			}
			if(i<arr.length-1)
				ans=ans+rev+" ";
			else
				ans=ans+rev;
			
		}
		System.out.println(ans);
		
	}

}

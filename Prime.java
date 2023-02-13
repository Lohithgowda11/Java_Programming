package programming;

import java.util.Scanner;

public class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
		boolean flag = true;
		for(int i=2;i<no;i++)
		{
			if(no/i==0)
			{
			flag= false;
			break;
			}
		}
		if(flag==true)
			System.out.println("It is a Prime number");
		else
			System.out.println("not a prime number");
		
	}

}

package programming;

import java.util.Scanner;

public class To_alphabet 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 26....");
		int no= sc.nextInt();
		System.out.println("In Capital Alphabet");
		System.out.println((char)(no+64));
		System.out.println("In Small Alphabet");
		System.out.println((char)(no+96));
		
	}

}

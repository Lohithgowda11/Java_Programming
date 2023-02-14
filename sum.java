package programming;

import java.util.Scanner;

public class sum {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
		int x = 0;
		while(no>9)
		{
			int x1=add(no);
		}
		System.out.println(x);
	}
	static int add(int no)
	{
		int sum=0;
		while(no!=0)
		{
			
			int rem = no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
	}

}

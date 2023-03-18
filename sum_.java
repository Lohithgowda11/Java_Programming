package programming;

import java.util.Scanner;

public class sum_ 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int sum=0;
		while(no!=0){
			int rem=no%10;
			sum=(sum)+rem;
			no=no/10;
		}
		System.out.println(sum);
	}

}

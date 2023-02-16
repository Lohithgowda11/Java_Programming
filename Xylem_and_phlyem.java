package programming;

import java.util.Scanner;

public class Xylem_and_phlyem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int copy=num;
		int isum=0;
		int osum=0;
		while(num!=0)
		{
			if(num==copy ||num<10)
				osum=osum+num%10;
			else
				isum=isum+num%10;
			num=num%10;
		}
		if(isum==osum)
			System.out.println(copy+" it is a xylem");
		else
			System.out.println(copy+" it is a Phloyem");
		
	}
}

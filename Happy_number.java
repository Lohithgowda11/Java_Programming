package programming;

import java.util.Scanner;

public class Happy_number 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number....");
		int num = sc.nextInt();
		int copy= num;
		int sum = 0;
		while(num>10){
			sum=0;
			do{
				int d = num%10;
				sum=sum+d*d;
				num= num/10;
				
			}while(num!=0);
			num=sum;
		}
		if(num==1 ||num==7)
			System.out.println(copy+" is a Happy Number");
		else
			System.out.println(copy+" is not a Happy Number");
	}

}

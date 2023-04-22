package practice_programs;

import java.util.Scanner;

public class Largest_number 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in a array");
		int no = sc.nextInt();
		int[] arr = new int[no];
		System.out.println("Enter the elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		int m=0;
		for (int i = 0; i < no; i++) 
		{
			if(arr[i]>m)
				m=arr[i];
		}
		System.out.println(m+" is a largest elements");
	}

}

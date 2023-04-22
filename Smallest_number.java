package practice_programs;

import java.util.Scanner;

public class Smallest_number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numberof elements in an array");
		int no = sc.nextInt();
		int[] arr = new int[no];
		System.out.println("Enter the elements");
		for (int i = 0; i < no; i++)
		{
			arr[i]= sc.nextInt();
			
		}
		int small=arr[0];
		for (int j = 0; j < arr.length; j++) {
			
		
		if(arr[j]<small)
		{
			small=arr[j];
		}
	}
		System.out.println(small+" is the smallest element");
	}

}

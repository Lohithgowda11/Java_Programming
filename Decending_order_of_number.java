package programming;

import java.util.Arrays;
import java.util.Scanner;

public class Decending_order_of_number 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		System.out.println("enter the Array elements");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Decending order of array elements");
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.println(arr[i]);

		}

	}
}

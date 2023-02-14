package programming;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending_order_of_number {
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
		System.out.println("Ascending order of array elemts");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

}

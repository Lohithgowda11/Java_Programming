package programming;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
		String cpy = str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (cpy.equals(rev)) {
			System.out.println("it is a Palindrome");
		} else
			System.out.println("it is not a Palindrome");
	}

}

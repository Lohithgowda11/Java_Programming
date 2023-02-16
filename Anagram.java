package programming;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1 String.....");
		String str1 = sc.next();
		System.out.println("Enter the 2 String.....");
		String str2 = sc.next();
		if (str1.length() != str2.length()) {
			System.out.println("Not a Anagram......");
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch2.length; i++) {
				if (ch1[i] == ch2[i]) {
					System.out.println("It is a Anagram");
					break;
				} else
					System.out.println("Not a Anagram......");
				break;

			}
		}

	}

}

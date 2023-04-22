package practice_programs;

import java.util.Scanner;

public class Reverse_Sentence 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String rev;
		String ans="";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			rev="";
			for (int j =  (arr[i].length()-1); j >=0; j--) {
				rev=rev+arr[i].charAt(j);
			}
			if(i<arr.length-1)
			ans=ans+rev+" ";
			else
				ans=ans+rev;
		}
		System.out.println(ans);
	}

}

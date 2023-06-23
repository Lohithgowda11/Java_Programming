package arithmeticoperation;

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		int a,b,c,ch;
		
		System.out.println("Enter two integer:");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		System.out.println("Select your choice according to the list");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		ch=r.nextInt();
		if(ch==1) {
		c=a+b;
		System.out.println("ADDITION OF YOUR GIVEN NUMBERS ARE: "+c);
		}
		else if(ch==2) {
		c=a-b;
		System.out.println("SUBTRACTION OF YOUR GIVEN NUMBERS ARE: "+c);
		}
		else if(ch==3) {
		c=a*b;
		System.out.println("MULTIPLICATION OF YOUR GIVEN NUMBERS ARE: "+c);
		}
		else if(ch==4) {
		c=a/b;
		System.out.println("DIVISION OF YOUR GIVEN NUMBERS ARE: "+c);
		}
		else {
		System.out.println("Please enter a valid choice");
		}
		
		}

}

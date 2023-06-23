package validation;

import java.util.Scanner;

public class EmailValidation {

	static boolean isValid(String email) {
		String regex="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		return email.matches(regex);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String email;
		boolean r;
		int i;
		for(i=0;i<=3;i++) {
			System.out.println("enter the email address: ");
			email=s.next();
			
			r= isValid(email);
			
			if(r==true) {
				System.out.print("The entered email ID is "+r);
				break;	
			}else {
				System.out.println("\n The entered email ID is "+ r+" \ntry again!\n");
			}
		}
	}
}

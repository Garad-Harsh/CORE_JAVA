package scanner;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char input = 'Y';
		
		 System.out.println("Enter your age");
			int age=sc.nextInt();
			
	         if (age >= 18) {
	                System.out.println("Person is allowed to vote");
	            } else {
	                System.out.println("Person is not allowed to vote");
	            }
	}

}

package Strings;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Demo2 student=new Demo2();
		
		System.out.println("Enter your username");
		String name = sc.next();
		System.out.println("Your name is " + name);

		System.out.println("Enter your password");
		String pass = sc.next();

		System.out.println("Your Password is " + pass);
		student.login(name,pass);
		
	}
	
	public void login(String name,String pass) {
		String name1="Harshal";
		String pass1="niv@123";
		
		if(name.contains(name1) && pass.contains(pass1)) {
			System.out.println("Valid Student");
		}else {
			if(!name.contains(name1)) {
				System.out.println("InValid Student");
			}else if(!pass.contains(pass1)) {
				System.out.println("InValid Student");
			}
			
		}
		
	}

}

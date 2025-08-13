
package Strings;
import java.util.Scanner;

public class Login{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Authenticator student=new Authenticator("harshal9373", "niv@123");
			
			System.out.println("Enter your username");
			String name = sc.next();
			System.out.println("Your name is " + name);

			System.out.println("Enter your password");
			String pass = sc.next();

			System.out.println("Your Password is " + pass);



			if (student.check(name,pass)) {
				System.out.println("Valid Student");

			} else {
				System.out.println("Invalid Student");
			}

		}
	

	

}
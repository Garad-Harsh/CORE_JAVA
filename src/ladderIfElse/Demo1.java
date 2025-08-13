package ladderIfElse;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Day");
		String str=sc.next();
		
		
		switch (str) {
		case "Monday": {
			System.out.println(1);
			break;
		}
		case "Tuesday": {
			System.out.println(2);
			break;
		}
		case "Wednsday": {
			System.out.println(3);
			break;
		}
		case "Thursday": {
			System.out.println(4);
			break;
		}
		case"Friday": {
			System.out.println(5);
			break;
		}
		case "Saturday": {
			System.out.println(6);
			break;
		}
		case "Sunday": {
			System.out.println(7);
			break;
		}
		default:
			System.out.println("Holiday");
		}
	}

}

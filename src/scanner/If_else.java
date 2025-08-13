package scanner;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {

		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of num1");
		num1 = sc.nextInt();
		System.out.println("value of a is " + num1);

		System.out.println("Enter value of num2");
		num2 = sc.nextInt();
		System.out.println("value of b is " + num2);

		if (num1 > num2) {
			if (num1 % 2 == 0) {
				System.out.println(num1 + "is larger");
			} else {
				System.out.println(num2);
			}
		}

	}
}

package scanner;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

			
   System.out.println("Enter value of a");
	int a=sc.nextInt();
	System.out.println("value of a is " +a);

	
	   System.out.println("Enter value of b");
		int b=sc.nextInt();
		System.out.println("value of b is " +b);
		
		Calculator c=new Calculator();
		c.printSum(a, b);  
		c.printSub(a, b);
		c.printMul(a, b);
		c.printDiv(a, b);
		

}

public void printSum(int a,int b) {
	int sum=a+b;
	System.out.println("Addition is:"+sum);
	
}

public void printSub(int a,int b) {
	int sub=a-b;
	System.out.println("Substration is:"+sub);
	
}

public void printMul(int a,int b) {
	int mul=a*b;
	System.out.println("Multiplication is:"+mul);
	
}

public void printDiv(int a,int b) {
	int div=a/b;
	System.out.println("Division is:"+div);
	
}


}
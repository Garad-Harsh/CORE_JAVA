package ConditionalStatement;

public class Demo1 {

	public static void main(String[] args) {
		int a=24;
		if(a%2==0) {
			System.out.println("it is even number");
			
			if(a%10==0) {
				System.out.println("number is divisible by 10");
			}
			else {
				System.out.println("number is not divisible by 10");
			}
		}
		else {
			System.out.println("it is odd number");
		}
	}

}

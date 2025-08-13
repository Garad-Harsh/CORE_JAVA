package scanner.If_else_Scanner;

public class Problem1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
            if (a % 2 == 0) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        } else {
            System.out.println(b);
        }

}

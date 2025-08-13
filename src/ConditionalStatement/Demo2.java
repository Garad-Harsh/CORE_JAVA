package ConditionalStatement;

public class Demo2 {

	public static void main(String[] args) {
		int maths = 51;
		int science = 49;
		int english = 51;
		int age = 19;

		int totalMarks = maths + science + english;

		// 1> age>17
		// 2>every subject marks>50
		// 3>total marks>160
		if (age > 17) {
			if (maths > 50 && science > 50 && english > 50) {
				if (totalMarks >= 160) {
					System.out.println("you are eligible for admission");
				} else {
					System.out.println("you are not eligible for admission");
				}

			} else {
				System.out.println("your are not eligible due  has less than 50 marks");
				if (maths < 50) {
					System.out.println("math has less marks");
				}

				if (science < 50) {
					System.out.println("science has less marks");
				}

				if (english < 50) {
					System.out.println("english has less marks");

				}
			}

		} else {
			System.out.println("Not eligible dut to age is less than 17");
		}

	}

}

package Loop;

public class While {

public static void main(String[] args) {
	int a=1;
	while(a<=10) {
		if(a==5) {
//			a++;
//			continue;
			break;
			
		}
		System.out.println(a);
		a++;
		}
	System.out.println("While loop exit");
	}
}

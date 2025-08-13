package ladderIfElse;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int input=sc.nextInt();
	    System.out.println("Enter Your Input");
	    
	    
	    if(input==1) {
	    	System.out.println("Monday");
	    }else if(input==2) {
	    	System.out.println("Tuesday");
	    }
	    else if(input==3) {
	    	System.out.println("Wed");
	    }
	    else if(input==4) {
	    	System.out.println("Thu");
	    }
	    else if(input==5) {
	    	System.out.println("Fri");
	    }
	    else if(input==6) {
	    	System.out.println("Sat");
	    }
	    else {
	    	System.out.println("Sunday");
	    }
	    
	  

	}

}

package Loop;

public class forloop {

public static void main(String[] args) {
	String day="Monday";
//	   String vowels = "AEIOUaeiou";
	for(int i=0;i<day.length();i++) {
		   char c = day.charAt(i);
          
           if (day.charAt(i) != 'a' && day.charAt(i) != 'e' && day.charAt(i) != 'i' && day.charAt(i) != 'o' && day.charAt(i) != 'u' ) {
               System.out.println(c);
		}
		
		
	}
}

}
package Strings;

public class Demo {

	public static void main(String[] args) {
		String s="amol patil";
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(1));
		System.out.println(s.concat(" batman"));
		
		System.out.println(s.endsWith("l"));
		System.out.println(s.startsWith("a"));
		System.out.println(s.endsWith("p"));
		System.out.println(s.startsWith("e"));
		
		System.out.println(s.indexOf("o"));
		System.out.println(s.indexOf("g"));
		
		System.out.println(s.contains("patil"));
		System.out.println(s.contains("karan"));
		
		System.out.println(s.isEmpty());
	}
}

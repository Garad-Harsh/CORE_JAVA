package scanner;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of  stu1");
		int marks1=sc.nextInt();
		
		System.out.println("Enter marks of  stu2");
		int marks2=sc.nextInt();
		
		   if (marks1 >= 90 || marks2 >= 90) {
	           System.out.println("Student has A grade");
	       }else if(marks1 < 80 || marks2 < 80) {
	           System.out.println("Student has B grade");
	       }else if(marks1 < 60 || marks2 < 60) {
	    	   System.out.println("Student has  C grade");
	       }else {
	    	   System.out.println("you are failed");
	       }

	}
	}
		
	

	

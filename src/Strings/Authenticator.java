package Strings;

import java.util.Scanner;

public class Authenticator {

	String user;
	String pass;
	

	public Authenticator(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}
	
	
	public boolean check(String username, String password) {
		return user.equals(username) && pass.equals(password);
	}
}

	


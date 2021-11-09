package Reg;

import java.util.regex.Pattern;

public class Reg1 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", "virender@gmail.com"));
		System.out.println(Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", "firstname@gmail.com"));
		System.out.println(Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", "test123prepare@co.edu.com"));
		System.out.println(Pattern.matches("^\\+[1-9]{1}[0-9]{3,14}$", "+919872234567"));
		


	}

}

package AssException;

import java.io.IOException;
import java.util.Scanner;

public class NumExample {
	public static int add(int num1,int num2) throws IOException {
		if (num1>900) {
			throw new IOException("Exception is thrown as num1 is greater than num2");
		}
			else if (num1<num2) {
				throw new ArithmeticException("Num2 is greater than num1");
			}
		
				else {
					
				return num1+num2;
			}
	}

	public static void main(String[] args) throws Exception {
		int result=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1=s.nextInt();
		System.out.println("Enter Second Number: ");
		int num2=s.nextInt();
		try{
			result=add(num1,num2);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
		System.out.println("Result: "+ result);

	}
}


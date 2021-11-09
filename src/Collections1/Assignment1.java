package Collections1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(12);
		l1.add(20);
		l1.add(15.0);
		l1.add(20.5);
		l1.add('c');
		l1.add('d');
		l1.add("true");
		LinkedHashSet<Integer> l2=new LinkedHashSet<Integer>();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		int n1 =s.nextInt();  
		System.out.println("Enter the Second Number: ");
		Integer n2 =s.nextInt(); 
		System.out.println("Enter the Third Number: ");
		Integer n3 =s.nextInt();  
		System.out.println("Enter the Fourth Number: ");
		Integer n4 =s.nextInt(); 
		System.out.println("Enter the Fifth Number: ");
		Integer n5 =s.nextInt();  
		System.out.println("Enter the Sixth Number: ");
		Integer n6 =s.nextInt();  
		System.out.println("Enter the Seventh Number: ");
		Integer n7 =s.nextInt(); 
		System.out.println("Enter the Eight Number: ");
		Integer n8 =s.nextInt();  
		l2.add(n1);
		l2.add(n2);
		l2.add(n3);
		l2.add(n4);
		l2.add(n5);
		l2.add(n6);
		l2.add(n7);
		l2.add(n8);
		System.out.println(l1);
		System.out.println(l2);
		
		
		
		
		
		
		
		
		
		
		








		
		
		

	}

}

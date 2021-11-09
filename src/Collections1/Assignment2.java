package Collections1;

import java.util.Set;
import java.util.TreeSet;

public class Assignment2 {

	public static void main(String[] args) {
	TreeSet t1=new TreeSet();
	t1.add("Java");
	t1.add("Python");
	t1.add("C++");
	t1.add("SQL");
	t1.add("C");
	t1.add("Pascal");
	System.out.println(t1);
	t1.remove("Java");
	t1.remove("C");
	System.out.println(t1);
	t1.add("HTML");
	t1.add("Visual Basic");
	t1.add("XML");
	System.out.println(t1);
	System.out.println(t1.contains("Java"));
	t1.removeAll(t1);
	System.out.println(t1);
	
	
	

	}

}

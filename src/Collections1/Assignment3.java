package Collections1;

import java.util.Iterator;
import java.util.LinkedList;

public class Assignment3 {

	public static void main(String[] args) {
		 LinkedList<String> list=new LinkedList<String>();
		 list.add("May");
		 list.add("June");
		 list.add("July");
		 list.add("August");
		 list.add("April");
		 list.add("November");
		 System.out.println("Original List:");
		 Iterator <String> it=list.iterator();
	     while(it.hasNext()){
	       System.out.println(it.next());
	     }	
	     list.addFirst( "January");
		 list.addLast("December");System.out.println("List after addition :");
		 Iterator <String> it1=list.iterator();
	     while(it1.hasNext()){
	       System.out.println(it1.next());
	     }		 
	     
		 
		 list.add(1, "March");
		 list.add(1, "Febuary");
		 System.out.println("List after more additions:");
		 Iterator <String> it2=list.iterator();
	     while(it2.hasNext()){
	       System.out.println(it2.next());
	     }		 		 
		 list.add(8, "September"); 
		 list.add(9, "October"); 
		 Iterator <String> it3=list.iterator();
	     while(it3.hasNext()){
	       System.out.println("List after more additions:"+it3.next());
	     }
		 list.remove("April");
		 list.add(3, "April");
		 System.out.println("Months in proper order:");
		 Iterator <String> it4=list.iterator();
	     while(it4.hasNext()){
	    	  System.out.println(it4.next());
	     }
		 
		 
		 


	}

}

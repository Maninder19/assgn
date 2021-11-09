package assignment.modifier.p2;
import assignment.modifier.p1.*;
import assignment.modifier.p2.*;

public class Y extends N{

	public static void main(String[] args) {
		M obj3=new M();
		Y obj4=new Y();
		X obj5=new X();
		obj3.methodPublic();
		obj4.n1();
		obj5.methodPublic();
		obj5.methodProtected();
		obj4.methodProtected();
		System.out.println("Output="+obj5.r);
		System.out.println("Output="+obj5.s);
		System.out.println("Output="+obj5.ch);
		System.out.println("Output="+obj4.p);
		
		
		
		

	}

}

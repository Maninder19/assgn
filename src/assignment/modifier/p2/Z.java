package assignment.modifier.p2;
import assignment.modifier.p1.M;
import assignment.modifier.p1.*;


public class Z extends  M{

	public static void main(String[] args) {
		Z obj3=new Z();
		N obj4=new N();
		X obj5=new X();
		P obj6=new P();
		obj3.methodPublic();
	obj3.methodProtected();
		obj4.n1();
		
		
		System.out.println("Output="+obj3.l);
		System.out.println("Output="+obj5.r);
		System.out.println("Output="+obj5.s);
		

	}

}

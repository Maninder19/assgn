package assignment.modifier.p2;

public class X {
	private int i=150;
	public char ch ='c';
	 long r=2000;
	protected float s=3000;
	public void methodPublic() {
		 x1();
	 }
	 
	  protected void methodProtected() {
		  x1();
		  
	  }
	  
	  void methodDefault() {
		  x1();
	  }
	
	private void x1() {
		System.out.println("The value of private int="+i);
		System.out.println("The value of public Char="+ch);
		System.out.println("The value of Long="+r);
		System.out.println("The value of Float ="+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

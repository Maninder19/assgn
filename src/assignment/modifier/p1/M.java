package assignment.modifier.p1;

public class M {
	private int i=10;
	long k=30;
	protected float l=40;
	
	 public void methodPublic() {
		 m2();
	 }
	 
	  protected void methodProtected() {
		  m2();
		  
	  }
	  
	  void methodDefault() {
		  m2();
	  }
	 private void m2() {
		 System.out.println("Value of Private integer ="+i);
		 System.out.println("Value of Long ="+k);
		 System.out.println("Value of Float ="+l);
	 }


	public static void main(String[] args) {
	
	}

}

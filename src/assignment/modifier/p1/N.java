package assignment.modifier.p1;

 public class N {
	
	public int n=200;
	double o=300;
	protected long p=400;
	
	public void methodPublic() {
		 n1();
	 }
	 
	  protected void methodProtected() {
		  n1();
		  
	  }
	  
	  void methodDefault() {
		  n1();
	  }
	
	 public void n1() {
		 System.out.println("Value of Private integer ="+n);
		 System.out.println("Value of Long ="+p);
		 System.out.println("Value of Double="+o);
	 
	 }

	

	public static void main(String[] args) {
		

	}

}

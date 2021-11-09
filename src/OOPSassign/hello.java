package OOPSassign;

public class hello extends infosys{
	
	public void run() {
		System.out.println("Running");
	}
	public  void stop() {
		System.out.println("Stop");
	}
	
	public void company() {
		System.out.println("Good Company");
	}

	public static void main(String[] args) {
		infosys i1=new hello();
		hello h1=new hello();
		i1.run();
		h1.run();
		h1.stop();
		h1.company();
		
	
		
		
		

	}

}

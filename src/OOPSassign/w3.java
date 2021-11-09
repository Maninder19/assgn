package OOPSassign;

public class w3 extends Vehicle {
	public void run() {
		System.out.println("Run");
	}
	public  void stop() {
		System.out.println("Stoping");
	}
	private int speed=35;
	private long distance=45;
	int no_of_tyres=3;


	public w3() {
		super(100,25);
	}
	public void display() {
		System.out.println("Speed="+speed);
		System.out.println("Dsitance="+distance);
		System.out.println("Number of Tyres="+no_of_tyres);
		
	}

	public static void main(String[] args) {
		Vehicle obj=new w3();
		   w3 obj1=new w3();
			obj.fuel(2,"hi");
			obj.fuel(75);
			obj.fuel('d', 20);
			obj1.display();
			obj.run();
			obj.stop();
			
	}

}

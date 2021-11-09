package OOPSassign;

public class w4 extends Vehicle{
	public void run() {
		System.out.println("Ram");
	}
	public  void stop() {
		System.out.println("Stp");
	}
	private int speed=45;
	private long distance=55;
	int no_of_tyres=4;
	public w4() {
		super(100,30);
	}
	public void display() {
		System.out.println("Speed="+speed);
		System.out.println("Dsitance="+distance);
		System.out.println("Number of Tyres="+no_of_tyres);
		
	}

	public static void main(String[] args) {
		Vehicle obj=new w4();
		   w4 obj1=new w4();
			obj.fuel(3,"ho");
			obj.fuel(85);
			obj.fuel('e', 30);
			obj1.display();
			obj.run();
			obj.stop();
			
	}

	}



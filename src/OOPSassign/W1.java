package OOPSassign;

public class W1 extends Vehicle{
	public void run() {
		System.out.println("Running");
	}
	public  void stop() {
		System.out.println("Stop");
	}
	private int speed=25;
	private long distance=35;

	public W1() {
		super(100,20);
	}
	int no_of_tyres=2;
	
	public void display() {
		System.out.println("Speed="+speed);
		System.out.println("Dsitance="+distance);
		System.out.println("Number of Tyres="+no_of_tyres);
		
	}
	public static void main(String[] args) {
		Vehicle obj=new W1();
	   W1 obj1=new W1();
		obj.fuel(1,"hello");
		obj.fuel(65);
		obj.fuel('c', 10);
		obj1.display();
		obj.run();
		obj.stop();
		
}

}

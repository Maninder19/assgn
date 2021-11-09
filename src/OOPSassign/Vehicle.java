package OOPSassign;

public abstract class Vehicle {
	public abstract void run();
	public abstract void stop();
	public void fuel (int i) {
		System.out.println("Value of Integer:"+i);
		}
	public void fuel(float f,String s) {
		System.out.println("Value of FLoat:"+f);
		System.out.println("Value of String:"+s);
		
	}
	
	public void fuel(char c,int j) {
		System.out.println("Value of Character:"+c);
		
		System.out.println("Value of Integer:"+j);
		
	}
	private int speed;
	private long distance;

	public Vehicle() {
		super();
	}
	public Vehicle(int speed, long distance) {
		
		System.out.println("Speed="+speed);
		System.out.println("Distance ="+distance);
	}

}

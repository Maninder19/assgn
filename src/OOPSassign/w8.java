package OOPSassign;

public class w8 extends Vehicle{
		public void run() {
			System.out.println("R");
		}
		public  void stop() {
			System.out.println("St");
		}
		private int speed=55;
		private long distance=65;
		int no_of_tyres=8;
		public w8() {
			super(80,30);
		}
		public void display() {
			System.out.println("Speed="+speed);
			System.out.println("Dsitance="+distance);
			System.out.println("Number of Tyres="+no_of_tyres);
			
		}

		public static void main(String[] args) {
			Vehicle obj=new w8();
			   w8 obj1=new w8();
				obj.fuel(3,"ho");
				obj.fuel(85);
				obj.fuel('e', 30);
				obj1.display();
				obj.run();
				obj.stop();
				
		}
		}

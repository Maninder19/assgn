package OOPSassign;

public class human extends monkey {
	public void eat() {
		System.out.println("Eating");
	}
	public  void sleep() {
		System.out.println("Sleeping");
	}
	

	public static void main(String[] args) {
		human h1=new human();
		h1.jump();
		h1.bite();
		h1.eat();
		h1.sleep();
	}

}

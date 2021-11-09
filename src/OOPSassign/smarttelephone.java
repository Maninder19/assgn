package OOPSassign;

public class smarttelephone extends telephone{
	public void lift() {
		System.out.println("Lifting");
	}
	public  void disconnect() {
		System.out.println("Hang up");
	}
	

	public static void main(String[] args) {
		telephone t1=new smarttelephone();
		t1.disconnect();
		t1.lift();

	}

}

package Asssignment2;

public class Area1 {
	int radius;
	int length;
	int breadth;
	int area;

	public Area1() {
		super();
	}

	public Area1(int length) {
		super();
		this.length = length;
	}

	public Area1(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public void circle() {
		area=(int) (3.14*length);
		System.out.println("Area of the circle="+area);
		
	}
	public void rectangle() {
		area=length*breadth;;
		System.out.println("Area of the rectangle="+area);
		
	}
	public void square() {
		area=length*length;
		System.out.println("Area of the Square="+area);
		
	}

	public void triangle() {
		area=(length*breadth)/2;
		System.out.println("Area of the Triangle="+area);
		
	}
	public void rhombus() {
		area=(length*breadth)/2;
		System.out.println("Area of the Rhombus="+area);
		
	}
	
	
	public static void main(String[] args) {
		Area1 a1=new Area1(25);
		Area1 a2=new Area1(25,35);
		Area1 a3=new Area1(5,35);
		Area1 a4=new Area1(25,40);
		a1.circle();
		a2.rectangle();
		a1.square();
		a3.triangle();
		a4.rhombus();
		

	}

}

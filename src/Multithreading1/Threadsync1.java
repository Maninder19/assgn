package Multithreading1;

public class Threadsync1 {

	public static void main(String[] args) {
		Threadsync obj = new Threadsync(); 
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		MyThread3 t3=new MyThread3(obj); 
		MyThread4 t4=new MyThread4(obj); 
		t2.start();  
		t3.start();  
		t1.start();
		t4.start();
		}  
		
	

	}



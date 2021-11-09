package Multithreading1;


public class Threadsync {  
		 synchronized void factorial (int n){//synchronized method  
			 int i,fact=1;  
			 for(i=1;i<=n;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+n+" is: "+fact);    
			 
		 try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 synchronized void add (int n,int m){//synchronized method  
			 int o=n+m;
			 System.out.println("Addition of two numbers is: "+o);    
	 
			 try{  
				 Thread.sleep(400);  
    }catch(Exception e){System.out.println(e);}  
  }  
 
}  

		  
		class MyThread1 extends Thread{  
			Threadsync t;  
		MyThread1(Threadsync t){  
		this.t=t;  
		}  
		public void run(){  
		t.factorial(4);  
		}  
		  
		}  
		class MyThread2 extends Thread{  
			Threadsync t;  
		MyThread2(Threadsync t){  
		this.t=t;  
		}  
		public void run(){  
		t.factorial(6);  
		}  
		}  
		class MyThread3 extends Thread{  
			Threadsync t;  
		MyThread3(Threadsync t){  
		this.t=t;  
		}  
		public void run(){  
		t.add(4,5);
		
		}  
		}  
		class MyThread4 extends Thread{  
			Threadsync t;  
		MyThread4(Threadsync t){  
		this.t=t;  
		}  
		public void run(){  
	    t.add(20, 10);  
		}  
		}  
		
		


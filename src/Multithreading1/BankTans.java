package Multithreading1;

public class BankTans implements Runnable{

		 private int amount = 10000;
		 
		
		 public synchronized void run() {
		  if(Thread.currentThread().getName().equals("withdraw")){
		   System.out.println("Entering to withdraw amount");
		 
		   if(this.amount >= 10000){
		    this.amount -= 10000;
		   }else{
		    try {
		     System.out.println("Insufficient balance and waiting for deposit....");
		     wait();
		     this.amount -= 5000; 
		     System.out.println("Amount withdraw completed successfully :)");
		    } catch (InterruptedException e) {
		     e.printStackTrace();
		    }
		   }
		  }else{
		   
		   System.out.println("Entering to deposit amount");
		   this.amount += 10000;
		   System.out.println("Amount deposited and notifying....");
		   notify();
		  }
		 }
		 
		 public static void main(String[] args) {
		  BankTans obj = new BankTans();
		  Thread withDraw = new Thread(obj, "withdraw");
		  Thread deposit = new Thread(obj, "deposit");
		  withDraw.start();
		  deposit.start();
		 }
		


	}



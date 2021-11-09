package Multithreading1;

public class waitnotify {
	int amt=10000;
	
	synchronized void withdraw(int amt) {
		System.out.println("Amount Withdraw:");
		if(this.amt<amt) {
			System.out.println("Less Balance");
			try {
				wait();
			}catch (Exception e){}
		}
		this.amt-=amt;
		System.out.println("Withdrawal Completed");
	}
	synchronized void deposit(int amt) {
		System.out.println("Amount deposited");
		this.amt+=amt;
		System.out.println("Deposit Completed:"+this.amt);
		notify();
	}
	public static void main(String[] args) {
	
		waitnotify w=new waitnotify();
		new Thread () {
			public void run() {
				w.withdraw(5000);
			}
		}.start();
		new Thread () {
			public void run() {
				w.withdraw(4000);
			}
		}.start();
		new Thread () {
			public void run() {
				w.withdraw(10000);
			}
		}.start();
		new Thread () {
			public void run() {
				w.deposit(10000);
			}
		}.start();
		
	}
	}

	



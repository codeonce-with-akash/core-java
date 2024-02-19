package dev.codeonce.mt;

public class DemonstratingYieldMethod implements Runnable {
	
	/**
	 * Here, yield() method is responsible to pause the current executing Thread for giving 
	 * a chance for executing remaining waiting Threads of same priority. 
	 */
	public void run() {
		for(int i = 1; i<=5; i++) {
			Thread.yield();
			System.out.println("Child Thread");
		}
	}
	
}

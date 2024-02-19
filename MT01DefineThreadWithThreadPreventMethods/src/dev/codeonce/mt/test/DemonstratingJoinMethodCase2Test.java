package dev.codeonce.mt.test;

import dev.codeonce.mt.DemonstratingJoinMethodCase2;

public class DemonstratingJoinMethodCase2Test {

	public static void main(String[] args) throws InterruptedException {
		DemonstratingJoinMethodCase2.mainThread = Thread.currentThread();
		DemonstratingJoinMethodCase2 r = new DemonstratingJoinMethodCase2();
		Thread t = new Thread(r);
		t.start();
		
		/**
		 * CASE#3 : If main thread calls join() method on child Thread object and 
		 * child Thread calls join() method on main Thread object then both Threads will wait forever
		 * and the program will be stuck in the middle. (This is something like Deadlock)   
		 */
		//t.join();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread - " + i);
		}
	}

}
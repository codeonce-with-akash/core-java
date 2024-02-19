package dev.codeonce.mt.test;

public class DemonstratingJoinMethodCase4 {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * CASE#4 : If a Thread calls join() method on the same Thread itself then the
		 * program will be stuck (This is something like Deadlock) in this case Thread
		 * has to wait infinite amount of time.
		 */
		Thread.currentThread().join();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread - " + i);
		}
	}

}

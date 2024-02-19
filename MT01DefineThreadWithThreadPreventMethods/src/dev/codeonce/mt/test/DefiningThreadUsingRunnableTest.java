package dev.codeonce.mt.test;

import dev.codeonce.mt.DefiningThreadUsingRunnable;

public class DefiningThreadUsingRunnableTest {
	/**
	 * Among the 2 ways of defining a Thread, implements Runnable approach is always recommended.
	 * In case of extending the Thread class we miss the benefits of inheritance. 
	 * In case of implements Runnable interface we can extend some other class also.
	 */
	public static void main(String[] args) {
		DefiningThreadUsingRunnable r = new DefiningThreadUsingRunnable();
		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread - " + i);
		}
	}
}

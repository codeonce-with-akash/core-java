package dev.codeonce.mt;

public class DemonstratingJoinMethod implements Runnable {

	/**
	 * If current executing Thread wants to wait until completing some other Thread then we should 
	 * go for join() method.
	 */
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread - " + i);
		}
	}

}

package dev.codeonce.mt;

public class DefiningThreadUsingRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread - " + i);
		}
	}
}

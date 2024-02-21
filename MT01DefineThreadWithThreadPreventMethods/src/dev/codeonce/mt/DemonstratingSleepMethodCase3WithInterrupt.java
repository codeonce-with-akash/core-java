package dev.codeonce.mt;

public class DemonstratingSleepMethodCase3WithInterrupt implements Runnable {
	public void run() {
		for (int i = 1; i <= 10000; i++) {
			System.out.println("Slide - " + i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("I am interrupted!");
		}
	}
}

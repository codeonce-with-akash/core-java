package dev.codeonce.mt;

public class DemonstratingSleepMethodCase1 implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Slide - " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

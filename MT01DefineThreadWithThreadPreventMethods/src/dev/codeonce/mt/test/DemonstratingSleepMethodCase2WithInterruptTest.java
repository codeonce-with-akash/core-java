package dev.codeonce.mt.test;

import dev.codeonce.mt.DemonstratingSleepMethodCase2WithInterrupt;

public class DemonstratingSleepMethodCase2WithInterruptTest {

	public static void main(String[] args) {
		DemonstratingSleepMethodCase2WithInterrupt r = new DemonstratingSleepMethodCase2WithInterrupt();
		Thread t = new Thread(r);
		t.start();
		t.interrupt();
		System.out.println("Main method about to end!");
	}
}

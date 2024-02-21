package dev.codeonce.mt.test;

import dev.codeonce.mt.DemonstratingSleepMethodCase3WithInterrupt;

public class DemonstratingSleepMethodCase3WithInterruptTest {
	public static void main(String[] args) {
		DemonstratingSleepMethodCase3WithInterrupt r = new DemonstratingSleepMethodCase3WithInterrupt();
		Thread t = new Thread(r);
		t.start();
		t.interrupt();
		System.out.println("Main method about to leave!");
	}
}

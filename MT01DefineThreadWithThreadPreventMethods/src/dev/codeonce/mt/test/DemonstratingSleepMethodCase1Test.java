package dev.codeonce.mt.test;

import dev.codeonce.mt.DemonstratingSleepMethodCase1;

public class DemonstratingSleepMethodCase1Test {

	public static void main(String[] args) {
		DemonstratingSleepMethodCase1 r = new DemonstratingSleepMethodCase1();
		Thread t = new Thread(r);
		t.start();
	}

}

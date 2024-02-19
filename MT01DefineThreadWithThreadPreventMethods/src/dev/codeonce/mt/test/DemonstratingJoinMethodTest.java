package dev.codeonce.mt.test;

import dev.codeonce.mt.DemonstratingJoinMethod;

public class DemonstratingJoinMethodTest {
	public static void main(String[] args) throws InterruptedException {
		DemonstratingJoinMethod r = new DemonstratingJoinMethod();
		Thread t = new Thread(r);
		t.start();
		t.join(3000);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread - " + i);
		}
	}
}

package dev.codeonce.mt.test;

import dev.codeonce.mt.DemonstratingYieldMethod;

public class DemonstratingYieldMethodTest {

	public static void main(String[] args) {
		DemonstratingYieldMethod r = new DemonstratingYieldMethod();
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread - " + i);
		}
	}
}

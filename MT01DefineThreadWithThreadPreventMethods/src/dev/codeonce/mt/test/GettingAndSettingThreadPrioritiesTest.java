package dev.codeonce.mt.test;

import dev.codeonce.mt.GettingAndSettingThreadPriorities;

public class GettingAndSettingThreadPrioritiesTest {
	public static void main(String[] args) {
		System.out.println("Main Thread Priority - " + Thread.currentThread().getPriority());
		GettingAndSettingThreadPriorities r = new GettingAndSettingThreadPriorities();
		Thread t = new Thread(r);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
	}
}

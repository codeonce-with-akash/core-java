package dev.codeonce.mt;

public class GettingAndSettingThreadPriorities implements Runnable {
	public void run() {
		System.out.println("Child Thread Priority - "+Thread.currentThread().getPriority());
	}
}

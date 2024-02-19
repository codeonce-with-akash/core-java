package dev.codeonce.mt;

public class GettingAndSettingThreadName implements Runnable {
	public void run() {
		System.out.println("Child Thread Name - "+Thread.currentThread().getName());
	}
}

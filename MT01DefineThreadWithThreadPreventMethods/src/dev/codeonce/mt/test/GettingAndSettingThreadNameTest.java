package dev.codeonce.mt.test;

import dev.codeonce.mt.GettingAndSettingThreadName;

public class GettingAndSettingThreadNameTest {
	public static void main(String[] args) {
		System.out.println("Main Thread Name - "+Thread.currentThread().getName());
		GettingAndSettingThreadName r = new GettingAndSettingThreadName();
		Thread t = new Thread(r);
		t.setName("Child Thread");
		Thread.currentThread().setName("Main Thread Pro");
		System.out.println("Renamed Main Thread - "+Thread.currentThread().getName());
		t.start();
	}
}

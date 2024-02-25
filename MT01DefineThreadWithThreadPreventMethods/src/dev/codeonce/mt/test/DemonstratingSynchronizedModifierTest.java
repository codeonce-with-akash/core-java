package dev.codeonce.mt.test;

import dev.codeonce.mt.DemonstratingSynchronizedModifier;
import dev.codeonce.mt.DemonstratingSynchronizedModifierThread;

public class DemonstratingSynchronizedModifierTest {
	public static void main(String[] args) {
		DemonstratingSynchronizedModifier d = new DemonstratingSynchronizedModifier();
		DemonstratingSynchronizedModifierThread t1 = new DemonstratingSynchronizedModifierThread(d, "Dhoni");
		DemonstratingSynchronizedModifierThread t2 = new DemonstratingSynchronizedModifierThread(d, "Yuvraj");
		DemonstratingSynchronizedModifierThread t3 = new DemonstratingSynchronizedModifierThread(d, "Sachin");
		DemonstratingSynchronizedModifierThread t4 = new DemonstratingSynchronizedModifierThread(d, "Kohli");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

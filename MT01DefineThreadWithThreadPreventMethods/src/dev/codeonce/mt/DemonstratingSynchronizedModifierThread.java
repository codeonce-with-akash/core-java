package dev.codeonce.mt;

public class DemonstratingSynchronizedModifierThread extends Thread {
	DemonstratingSynchronizedModifier d;
	String name;

	public DemonstratingSynchronizedModifierThread(DemonstratingSynchronizedModifier d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

package dev.codeonce.mt.test;

import dev.codeonce.mt.DefiningThreadUsingTread;

public class DefiningThreadUsingTreadTest {
	public static void main(String[] args) {
		DefiningThreadUsingTread thread = new DefiningThreadUsingTread();
		thread.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread - " + i);
		}
	}
}
package dev.codeonce.mt;

public class DemonstratingJoinMethodCase2 implements Runnable {

	public static Thread mainThread;

	public void run() {
		
		try {
			//CASE#2 child thread invoking join() method on main thread object  
			mainThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread - " + i);
		}
		
	}
}

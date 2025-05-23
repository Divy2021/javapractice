package multiThreading;

import java.util.concurrent.TimeUnit;

public class SampleExecutors implements Runnable {

	public void run() {
		try {
			Long duration = (long) (Math.random() * 5);
			System.out.println(duration);
			System.out.print("Running Thread");
			TimeUnit.SECONDS.sleep(duration);
			System.out.print("Thread Completed");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}
}

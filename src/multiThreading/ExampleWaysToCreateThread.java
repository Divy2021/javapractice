package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExampleWaysToCreateThread {

	public static void main(String[] args) {

		MyRunnableTask thread1 = new MyRunnableTask();
		Thread t1 = new Thread(thread1);
		t1.start();
		t1.stop();
		MyRunnableTask2 thread2 = new MyRunnableTask2();
		thread2.start();

		for (int i = 0; i < 5; i++) {
			Thread thr1 = new Thread(new MyRunnableTask());
			thr1.start();
			System.out.println("Mainmythread  " + Thread.currentThread());
		}

		ExecutorService ex = Executors.newFixedThreadPool(5);
	}

}

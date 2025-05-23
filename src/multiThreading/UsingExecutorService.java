package multiThreading;

import java.util.concurrent.ExecutorService;
//import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class UsingExecutorService {
	public static void main(String[] arguments) throws InterruptedException {
		// ExecutorService e = anExecutor();//Executors.newFixedThreadPool(10);
		// e.execute(new sampleExecutors());
		// ThreadPoolExecutor pool = (ThreadPoolExecutor)e;
		// pool.shutdown();
		ExecutorService ex = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 5; i++) {
			ex.execute(new MyRunnableTask());
		}

		System.out.println("main thread" + Thread.currentThread());

		ScheduledExecutorService se = Executors.newScheduledThreadPool(5);
		ScheduledExecutorService se1 = Executors.newScheduledThreadPool(1);
		se.schedule(new MyRunnableTask2(), 2, TimeUnit.SECONDS);// runs only once
		se.scheduleAtFixedRate(new MyRunnableTask(), 2, 2, TimeUnit.SECONDS); // runs every 2 sec
		se1.scheduleAtFixedRate(new MyRunnableTask2(), 10, 10, TimeUnit.SECONDS); // runs every 1 sec
		// se.schedule
		se.shutdown();
		System.out.println("Main mythread  " + Thread.currentThread());
		System.out.println("Main count  " + Thread.activeCount());
	}
//	  final Queue<Runnable> tasks = new ArrayDeque<>();
//	   final Executor executor;
//	   Runnable active;
//
//	   SerialExecutor(Executor executor) {
//	     this.executor = executor;
//	   }
//
//	   public synchronized void execute(Runnable r) {
//	     tasks.add(() -> {
//	       try {
//	         r.run();
//	       } finally {
//	         scheduleNext();
//	       }
//	     });
}

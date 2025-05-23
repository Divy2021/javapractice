package multiThreading;

public class EvenOddThread {
	// volatile
	volatile static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
	int start = 0;

	public synchronized void printEven() {
		int i = 0;
		while (i < arr.length) {
			if (arr[i] % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + " :" + arr[i]);
				notifyAll();
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			i++;
		}
	}

	public synchronized void printOdd() {
		int j = 0;
		while (j < arr.length) {
			if (arr[j] % 2 == 1) {
				System.out.println(Thread.currentThread().getName() + " :" + arr[j]);
				notifyAll();
			} else {
				try {
					wait(2000000000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddThread obj = new EvenOddThread();

		Thread t1 = new Thread(()->
				obj.printEven());
		t1.setName("Even");
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.printOdd();
			}
		});
		t2.setName("Odd");

		t1.start();
		t2.start();
	}
}

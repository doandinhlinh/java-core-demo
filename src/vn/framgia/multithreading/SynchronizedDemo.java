package vn.framgia.multithreading;

public class SynchronizedDemo extends Thread {

	private String mThreadName;

	public SynchronizedDemo(String threadName) {
        this.mThreadName = threadName;
    }

	@Override
	public void run() {
		ShareMemory.printData(mThreadName);
	}

	public static void main(String[] args) {
		SynchronizedDemo thread1 = new SynchronizedDemo("Thread1");
		SynchronizedDemo thread2 = new SynchronizedDemo("Thread2");
		SynchronizedDemo thread3 = new SynchronizedDemo("Thread3");
 
        thread1.start();
        thread2.start();
        thread3.start();
	}

}

class ShareMemory {
	public static 	 void printData(String threadName) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(threadName + ": " + i);
		}
	}
}

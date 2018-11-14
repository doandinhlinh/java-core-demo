package vn.framgia.multithreading;

public class ThreadSimple extends Thread {
	private String threadName;
	public ThreadSimple(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {
		try {
			for (int i = 1; i <= 100; i++) {
				System.out.println(threadName + " : "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadSimple threadSimple = new ThreadSimple("Thread 1");
//		threadSimple.setPriority(MAX_PRIORITY);
		threadSimple.setDaemon(true);
		threadSimple.start();
		ThreadSimple threadSimple2= new ThreadSimple("Thread 2");
//		threadSimple2.setPriority(MIN_PRIORITY);
//		threadSimple2.start();
		Thread.sleep(3000);
		System.out.println("END");
	}

}

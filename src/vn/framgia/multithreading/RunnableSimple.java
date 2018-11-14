package vn.framgia.multithreading;

public class RunnableSimple implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new RunnableSimple());
		Thread thread2 = new Thread(new RunnableSimple());
		
		thread1.start();
		thread2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 1; i <= 100; i++) {
				System.out.println(i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

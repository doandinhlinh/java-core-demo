package vn.framgia.multithreading;

public class DaemonThread {
	public static void main(String[] args) {
		Thread normalThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Normal Thread start");
				try {
					for (int i = 1; i <= 100; i++) {
						System.out.println("Normal Thread : " + i);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread daemonThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Deamon Thread start");
				try {
					for (int i = 1; i <= 100; i++) {
						System.out.println("Daemon Thread : " + i);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		daemonThread.setDaemon(true);
		daemonThread.start();
//		normalThread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End!");
	}
}

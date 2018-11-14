package vn.framgia.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorDemo {
	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Scheduling: " + System.nanoTime());
			}
		};
		
		ScheduledFuture<?> future = scheduledExecutor.schedule(task, 3, TimeUnit.SECONDS);
		
		TimeUnit.MILLISECONDS.sleep(1337);
		long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
		System.out.printf("Remaining Delay: %sms\n", remainingDelay);
		
		scheduledExecutor.shutdown();
	}
}

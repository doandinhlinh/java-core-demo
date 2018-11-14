package vn.framgia.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class ExecutorDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Integer> future = executor.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				try {
					TimeUnit.SECONDS.sleep(3);
					return 123;
				} catch (Exception e) {
					e.printStackTrace();
				}
				return null;
			}
		});
		
		Integer result = future.get();
		System.out.println("result: " + result);
		
		ExecutorService executors = Executors.newFixedThreadPool(2);
		List<CountTask> tasks = Arrays.asList(new CountTask("task1"),
				new CountTask("task2"), new CountTask("task3"),
				new CountTask("task4"), new CountTask("task5"));
		List<Future<String>> futures = executors.invokeAll(tasks);
		
		for (Future<String> f : futures) {
			System.out.println(f.get());
		}
		
		executor.shutdown();
		executors.shutdown();
	}
}

class CountTask implements Callable<String> {
	private String nameTask;
	
	public CountTask(String nameTask) {
		this.nameTask = nameTask;
	}

	@Override
	public String call() throws Exception {
		return this.nameTask;
	}
	
}

package vn.framgia.collectiondemo;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Item> priorityQueue = new PriorityQueue<>();
		
		Item item1 = new Item(1, "item1");
		Item item2 = new Item(2, "item2");
		Item item3 = new Item(2, "item-2");
		Item item4 = new Item(3, "item3");
		Item item5 = new Item(3, "item3");
		Item item6 = new Item(4, "item4");
		
		priorityQueue.add(item1);
		priorityQueue.add(item1);
		priorityQueue.add(item2);
		priorityQueue.add(item3);
		priorityQueue.add(item4);
		priorityQueue.add(item5);
		priorityQueue.add(item6);
		
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.peek());
	}
}

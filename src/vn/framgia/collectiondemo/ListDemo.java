package vn.framgia.collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		Item item1 = new Item(1, "item1");
		Item item2 = new Item(2, "item2");
		Item item3 = new Item(2, "item-2");
		Item item4 = new Item(3, "item3");
		Item item5 = new Item(3, "item3");
		Item item6 = new Item(4, "item4");
		
		List<Item> arrayList = new ArrayList<>();
		
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);
		arrayList.add(item4);
		arrayList.add(item5);
		arrayList.add(item6);
		
		System.out.println(arrayList);
		
		List<Item> linkedList = new LinkedList<>();
		
		linkedList.add(item1);
		linkedList.add(item2);
		linkedList.add(item3);
		linkedList.add(item4);
		linkedList.add(item5);
		linkedList.add(item6);
		
		System.out.println(linkedList);
	}
}

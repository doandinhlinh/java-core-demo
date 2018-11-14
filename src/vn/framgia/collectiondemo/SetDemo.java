package vn.framgia.collectiondemo;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	enum days {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enum set demo
		Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:" + set1);
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:" + set2);
        EnumSet<days> set3 = EnumSet.range(days.MONDAY, days.FRIDAY);
        System.out.println("Week Days:" + set3);
        
		Item item1 = new Item(1, "item1");
		Item item2 = new Item(2, "item2");
		Item item3 = new Item(2, "item-2");
		Item item4 = new Item(3, "item3");
		Item item5 = new Item(3, "item3");
		Item item6 = new Item(4, "item4");

		Set<Item> treeSet = new TreeSet<>();
		
		treeSet.add(item1);
		treeSet.add(item2);
		treeSet.add(item3);
		treeSet.add(item4);
		treeSet.add(item5);
		treeSet.add(item6);
		System.out.println(treeSet);
		
		Set<Item> hashSet = new HashSet<>();
		
		hashSet.add(item1);
		hashSet.add(item2);
		hashSet.add(item3);
		hashSet.add(item4);
		hashSet.add(item5);
		hashSet.add(item6);
		System.out.println(hashSet);
		
	}

}

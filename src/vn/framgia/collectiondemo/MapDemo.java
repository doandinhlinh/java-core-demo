package vn.framgia.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item(1, "item1");
		Item item2 = new Item(2, "item2");
		Item item3 = new Item(2, "item-2");
		Item item4 = new Item(3, "item3");
		Item item5 = new Item(3, "item3");
		Item item6 = new Item(4, "item4");
		
		Map<String, Item> map = new HashMap<String, Item>();
		
		map.put(null, item1);
		map.put("item1", item1);
		map.put("item2", item2);
		map.put("item3", item3);
		map.put("item4", item4);
		map.put("item5", item5);
		
		System.out.println(map.get("item1"));
		System.out.println(map.get(null));
		System.out.println(map.containsKey("item4"));
		
	}

}

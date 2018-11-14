package vn.framgia.genericdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class GenericDemo<T> {
	

	public static void main(String[] args) {
		GenericDemo genericDemo = new GenericDemo();
		ArrayList<Object> arrayList = new ArrayList();
		arrayList.add("123");
		arrayList.add(1);
		arrayList.add(new HashMap<String, String>());
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
	}
}

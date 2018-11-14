package vn.framgia.genericdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class GenericDemo {

	public static void main(String[] args) {
		MyGeneric<String> generic1 = new MyGeneric<String>();
		generic1.setFirst("David");
		generic1.setSecond("Beckham");
		
		MyGeneric<Integer> generic2 = new MyGeneric<Integer>(1, 2);
		
		System.out.println("This is first of object generic1: " + generic1.getFirst());
		System.out.println("This is second of object generic1: " + generic1.getSecond());
		System.out.println("This is first of object generic2: " + generic2.getFirst());
		System.out.println("This is second of object generic2: " + generic2.getSecond());
		
//		ArrayList<Object> arrayList = new ArrayList();
//		arrayList.add("123");
//		arrayList.add(1);
//		arrayList.add(new HashMap<String, String>());
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add(4);
	}

}

class MyGeneric<T> {
	private T first;
	private T second;
	
	public MyGeneric() {
		first = null;
		second = null;
	}
	
	public MyGeneric(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() { return this.first; }
	
	public T getSecond() { return this.second; }
	
	public void setFirst(T first) { this.first = first; }
	
	public void setSecond(T second) { this.second = second; }
}

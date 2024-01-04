package collectionsex;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add("vinay");
		ll.add('B');
		ll.add(true);
		ll.add(null);
		ll.add(10);
		ll.add(10.99);
		System.out.println("Array list elements are : "+ll);
		ll.addFirst(100);
		ll.addLast(200);
		System.out.println("adding first and last Array list elements are : "+ll);
		Iterator it = ll.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

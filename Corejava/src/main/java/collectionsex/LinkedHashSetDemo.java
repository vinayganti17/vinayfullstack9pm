package collectionsex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add("vinay");
		lhs.add('c');
		lhs.add(true);
		lhs.add(10);
		lhs.add("vinay");
		lhs.add("Kumar");
		lhs.add(null);
		System.out.println("hash set elements are :"+lhs);
		System.out.println(lhs.contains("vinay"));
		System.out.println(lhs.size());
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(200);
		lhs1.add(500);
		System.out.println("first hash set elements are :"+lhs);
		lhs.addAll(lhs1);
		System.out.println("after added hash set elements are :"+lhs);
		System.out.println(lhs.containsAll(lhs1));
		lhs1.clear();
		System.out.println("after calling second hash set elements are : "+lhs1);
		System.out.println(lhs1.isEmpty());
		Iterator it = lhs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}


	}

}

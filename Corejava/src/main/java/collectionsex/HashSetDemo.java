package collectionsex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("vinay");
		hs.add('c');
		hs.add(true);
		hs.add(10);
		hs.add("vinay");
		hs.add("Kumar");
		hs.add(null);
		System.out.println("hash set elements are :"+hs);
		System.out.println(hs.contains("vinay"));
		System.out.println(hs.size());
		HashSet hs1 = new HashSet();
		hs1.add(200);
		hs1.add(500);
		System.out.println("first hash set elements are :"+hs);
		hs.addAll(hs1);
		System.out.println("after added hash set elements are :"+hs);
		System.out.println(hs.containsAll(hs1));
		hs1.clear();
		System.out.println("after calling second hash set elements are : "+hs1);
		System.out.println(hs1.isEmpty());
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}

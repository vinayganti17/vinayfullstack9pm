package collectionsex;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("vinay");
		al.add('B');
		al.add(true);
		al.add(null);
		al.add(10);
		al.add(10.99);
		System.out.println("Array list elements are : "+al);
		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add(200);
		al.addAll(al2);
		System.out.println("after adding Array list2 elements are : "+al);
		System.out.println(al.contains("vinay"));
		al2.clear();
		System.out.println("after clear array list2 elemnts :"+al2);
		System.out.println(al2.isEmpty());
		ListIterator lt = al.listIterator();
		System.out.println("....forward....");
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("....backward....");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}

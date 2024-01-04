package innerclasses;

interface Demo{
	public void m1();
}
interface Hello{
	public void sayHello(String name);
}
interface Addition{
	public int add(int i, int j);
}

public class AnonymousDemo {

	public static void main(String[] args) {
		Demo d = ()->System.out.println("demo m1 method implementation");
		d.m1();
		Hello h = (name)->System.out.println("Hello Mr. "+name);
		h.sayHello("Vinay");
		Addition add = (i,j)->(i+j);
		System.out.println(add.add(20,10));
	}

}

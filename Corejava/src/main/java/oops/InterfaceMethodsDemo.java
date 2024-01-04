package oops;

interface First{
	public void m1();
	default void m2() {
		System.out.println("In java 8 interface default method");
	}
	static void m3() {
		System.out.println("In java 8 interface static method");
	}
}
class A implements First{
	public void m1() {
		System.out.println("First interface m1 based on A class implementation");
	}
}
class B implements First{
	public void m1() {
		System.out.println("First interface m1 based on B class implementation");
	}
}
public class InterfaceMethodsDemo {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m2();
		B b = new B();
		b.m1();
		b.m2();
		First.m3();

	}

}

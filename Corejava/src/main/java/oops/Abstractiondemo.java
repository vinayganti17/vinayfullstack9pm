package oops;

abstract class ProductOne {

	public abstract void productone();

	public void m1() {
		System.out.println("From abstract class m1 method implementation");
	}
}

public class Abstractiondemo extends ProductOne {

	public static void main(String[] args) {
		Abstractiondemo obj = new Abstractiondemo();
		obj.m1();
		obj.productone();

	}

	@Override
	public void productone() {
		System.out.println("this is product one method");
	}

}

package basics;

public class VariableTypes {

	int b = 20;
	static int c = 30;
	public static void main(String[] args) {
		VariableTypes obj = new VariableTypes();
		int a = 10;
		System.out.println("A ="+a);
		System.out.println("B ="+obj.b);
		System.out.println("C ="+c);
		obj.m1();

	}
	public void m1() {
		System.out.println("C ="+c);
	}
	
}

package basics;

public class MethodtypesDemo {

	public void greet() {
		System.out.println("Welcome to java programming...");
	}
	public int add(int i, int j) {
		return i+j;
	}
	public static void display() {
		System.out.println("Hello World Java");
	}
	public static void main(String[] args) {
		MethodtypesDemo obj = new MethodtypesDemo();
		obj.greet();
		System.out.println(obj.add(20, 30));
		display();

	}

}

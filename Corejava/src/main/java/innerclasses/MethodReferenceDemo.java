package innerclasses;

class Person{
	void printName() {
		System.out.println("Vinay");
	}
}
@FunctionalInterface
interface Printer{
	void print();
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		Person p = new Person();
		Printer printer = p::printName;
		printer.print();

	}

}

package oops;

public class Person {
	
	String name;
	int age;
	int height;
	int weight;
	
	public void eat() {
		System.out.println("Mr. "+name+" eat nice food");
	}
	public void sleep() {
		if(age<18)
			System.out.println("sleep atleast 9 hours");
		else
			System.out.println("sleep atleast 8 hours");
	}

	public static void main(String[] args) {
		Person child = new Person();
		child.name = "Vinay";
		child.age = 12;
		child.height = 12;
		child.weight = 18;
		child.eat();
		child.sleep();

	}

}

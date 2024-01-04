package innerclasses;

public class MethodLocalInnerClassDemo {
	
	private int data = 20;
	
	public void display() {
		class InnerClass{
			public void m1() {
				System.out.println("data "+data);
			}
		}
		InnerClass in = new InnerClass();
		in.m1();
	}

	public static void main(String[] args) {
		MethodLocalInnerClassDemo outer = new MethodLocalInnerClassDemo();
		outer.display();

	}

}

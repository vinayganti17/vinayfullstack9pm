package innerclasses;

public class MemeberInnerClassDemo {
	
	private int data = 10;
	
	class Inner{
		public void m1() {
			System.out.println("data "+data);
		}
	}
	public void display() {
		Inner in = new Inner();
		in.m1();
	}

	public static void main(String[] args) {
		MemeberInnerClassDemo obj = new MemeberInnerClassDemo();
		obj.display();
		
		MemeberInnerClassDemo.Inner in =new MemeberInnerClassDemo().new Inner();
		in.m1();

	}

}

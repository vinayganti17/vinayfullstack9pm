package innerclasses;

public class StaticInnerClassDemo {
	
	private static int data = 40;
	
	static class StaticInner{
		public static void m1() {
			System.out.println("data "+data);
		}
	}

	public static void main(String[] args) {
		StaticInner.m1();

	}

}

package innerclasses;

interface one{
	public void m1();
}

public class AnonymousInnerClassDemo {
	
	private static int data = 30;

	public static void main(String[] args) {
		one o = new one() {
			
			@Override
			public void m1() {
				System.out.println("data "+data);
				
			}
		};
		o.m1();

	}

}

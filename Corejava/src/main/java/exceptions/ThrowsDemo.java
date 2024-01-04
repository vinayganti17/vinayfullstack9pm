package exceptions;

public class ThrowsDemo {
	
	public void display() {
		System.out.println(10/0);
	}

	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		System.out.println("First Line");
		try {
			obj.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Last Line");

	}

}

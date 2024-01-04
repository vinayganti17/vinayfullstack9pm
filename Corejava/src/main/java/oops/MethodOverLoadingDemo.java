package oops;

public class MethodOverLoadingDemo {
	
	public int add(int i, int j) {
		return i+j;
	}
	public int add(int i, int j,int k) {
		return i+j+k;
	}

	public static void main(String[] args) {
		MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(20, 20, 60));

	}

}

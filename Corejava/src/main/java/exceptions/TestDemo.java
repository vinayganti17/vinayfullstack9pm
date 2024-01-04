package exceptions;

public class TestDemo {
	
	public static void main(String args[]) {
		System.out.println("First line ");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
			System.err.println("some problem here");
		}
		finally {
			System.out.println("..finally..");
		}
		System.out.println("Last line ");
	}

}

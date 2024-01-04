package oops;

class CentralGovt{
	public void tax() {
		System.out.println("central tax govt");
	}
}

class StateGovt extends CentralGovt{
	public void tax() {
		System.out.println("state tax govt + central tax govt");
	}
}

public class MethodOverridingDemo {
	
	public static void main(String args[]) {
		StateGovt obj = new StateGovt();
		obj.tax();
	}

}

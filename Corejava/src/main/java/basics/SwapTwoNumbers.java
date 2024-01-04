package basics;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value ?");
		int a = sc.nextInt();
		System.out.println("Enter B value ?");
		int b = sc.nextInt();
		System.out.println("A :"+a+  "B :"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("A :"+a+  "B :"+b);

	}

}

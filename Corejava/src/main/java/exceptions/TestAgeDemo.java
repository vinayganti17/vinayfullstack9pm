package exceptions;

import java.util.Scanner;

class TooYoungAgeException extends RuntimeException{
	TooYoungAgeException(String msg) {
		super(msg);
	}
}
class TooOldAgeException extends RuntimeException{
	TooOldAgeException(String msg) {
		super(msg);
	}
}

public class TestAgeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur age?..");
		int age = sc.nextInt();
		if(age<18)
			throw new TooYoungAgeException("You have to wait some time");
		else if(age>60)
			throw new TooOldAgeException("your young age already over take care");
		else
			System.out.println("Welcome to Voting System");

	}

}

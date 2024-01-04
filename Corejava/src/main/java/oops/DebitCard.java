package oops;

public class DebitCard {

	private int pinNumber;

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public static void main(String[] args) {
		DebitCard visaCard = new DebitCard();
		visaCard.setPinNumber(12345);
		System.out.println("VisaCard pin number is :"+visaCard.getPinNumber());

	}

}

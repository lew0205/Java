package chapter05;

class Card {
	String kind; // 무늬
	int number; // 숫자

	static int width; // 폭
	static int height; // 높이
}

public class Sample01 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		Card.width = 100;
		Card.height = 250;

		c1.kind = "Heart";
		c2.kind = "Spade";

		c1.number = 7;
		c2.number = 4;

		System.out.println("c1.kind = " + c1.kind + ", c1.nummber = " + c1.number);
		System.out.println("c1.width = " + c1.width + ", c1.height = " + c1.height);
		System.out.println("c2.kind = " + c2.kind + ", c2.nummber = " + c2.number);
		System.out.println("c2.width = " + c2.width + ", c2.height = " + c2.height);

		Card.width = 50;
		Card.height = 80;

		System.out.println("크기 = " + c1.width + ", 높이 = " + c1.height);
		System.out.println("크기 = " + c2.width + ", 높이 = " + c2.height);
	}

}

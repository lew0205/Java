package chapter02;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.printf("%d + %d = %d", x, y, x+y);
		sc.close();
	}
}

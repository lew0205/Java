package _9_6;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);

		/*
		 * System.out.println("정수를 키보드로 입력하시오 : "); n = in.nextInt();
		 */

		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));

		// result = factorial(n);
		/*
		 * while (n > 0) { result*=n; n--; }
		 */
		/*
		 * while (true) { if (n == 0) break; else result *= n; n--; }
		 */
		// System.out.println(result);
	}

	static int factorial(int x) {
		int r = 1;
		while (x > 0) {
			r *= x;
			x--;
		}
		return r;
	}

	static int factorial(int x, int y) {
		int r = 1;
		while (x <= y) {
			r *= x;
			x++;
		}
		return r;
	}

}

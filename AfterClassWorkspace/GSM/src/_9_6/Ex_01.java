package _9_6;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int sum = 0;

		while (i < 5) {
			int a = sc.nextInt();

			if (a == 0)
				break;

			if (a % 2 != 0)
				sum += a;
			i++;
		}
		System.out.println(sum);
	}

}
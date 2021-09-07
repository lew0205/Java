package _9_6;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Bigger(a, b));

		float a1 = sc.nextFloat();
		float b1 = sc.nextFloat();
		System.out.println(Bigger1(a1, b1));
		
		int a2 = sc.nextInt();
		float b2 = sc.nextFloat();
		System.out.println(Bigger2(a2, b2));
	}

	public static int Bigger(int a, int b) {
		return (a > b ? a : b);
	}

	public static float Bigger1(float a, float b) {
		return (a > b ? a : b);
	}

	public static float Bigger2(int a, float b) {
		return (a > b ? a : b);
	}
}

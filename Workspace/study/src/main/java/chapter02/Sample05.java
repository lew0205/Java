package chapter02;

import java.util.Scanner;

public class Sample05 {
	
	public static void main(String[] args) {
		System.out.println("두 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b)
		System.out.printf("출력 : %d",a);
		else if(a<b)
		System.out.printf("출력 : %d",b);
		else
			System.out.println("출력 : 0");
	}
}

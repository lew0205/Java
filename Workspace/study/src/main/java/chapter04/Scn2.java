package chapter04;

import java.util.Scanner;

public class Scn2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.println("나이 : "+age+", 이름 : "+name);
	}

}

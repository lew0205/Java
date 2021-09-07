package chapter04;

import java.util.Scanner;

public class Scn3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		sc.nextLine();
		
		System.out.println("독서명 입력 : ");
		String bName = sc.nextLine();
		
		System.out.println("학번 : "+num+", 이름 : "+name+", 독서명 : "+bName);
	}

}

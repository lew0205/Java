package chapter03;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int scr = sc.nextInt();
		System.out.println("당신의 학점은 ");
		if(scr>=90)
		{
			System.out.print("A");
		}
		else if (scr>=80)
		{
			System.out.print("B");
		}
		else if (scr>=70)
		{
			System.out.print("C");
		}
		else if (scr>=60)
		{
			System.out.print("D");
		}
		else
		{
			System.out.print("F");
		}
	}

}

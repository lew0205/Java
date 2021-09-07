package chapter02;

import java.util.Scanner;

public class Sample16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=70)
		{
			if((b>=30&&c>=30)||b+c==80)
			{
				System.out.println("졸업 가능");
			}
			else
			{
				System.out.println("졸업 불가능");
			}
		}
		else
		{
			System.out.println("졸업 불가능");
		}
	}

}

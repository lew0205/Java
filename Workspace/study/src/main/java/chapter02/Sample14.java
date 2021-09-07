package chapter02;

import java.util.Scanner;

public class Sample14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x%4==0&&x%5==0)
		{
			System.out.println("① true");
		}
		else
		{
			System.out.println("① false");
		}
		if(x%4==0||x%5==0)
		{
			System.out.println("② true");
			if(x%4==0&&x%5==0)
			{
				System.out.println("③ false");
			}
			else
			{
				System.out.println("③ true");
			}
		}
		else
		{
			System.out.println("② false");
		}
	}

}

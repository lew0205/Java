package chapter02;

import java.util.Scanner;

public class Sample11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec=sc.nextInt();
        int m=sec/60;
        sec%=60;
        int h=m/60;
        m%=60;
        System.out.print(h+"시간 ");
        System.out.print(m+"분 ");
        System.out.print(sec+"초");
        }

}

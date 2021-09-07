package chapter02;

import java.util.Scanner;

public class Sample15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        var num=sc.nextInt();
        var sum=0;
        while(num!=0) {
                var temp=num%10;
                sum+=temp;
                num/=10;
	}

}
}
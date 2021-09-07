package chapter04;

import java.util.Scanner;

class Car2{
	String name;
	String color;
	int seat;
	float gas_mileage;
	
	void carPrint() {
		System.out.println("차량 번호 : "+name);
		System.out.println("색깔 : "+color);
		System.out.println("좌석 : "+seat+"인승");
		System.out.println("연비 : "+gas_mileage);
		System.out.println();
	}
	
	String carEnrollment() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
}

public class Cartest2 {

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		car1.name = car1.carEnrollment();
		car1.color = "white";
		car1.seat = 5;
		
		Car2 car2 = new Car2();
		car2.name = car2.carEnrollment();
		car2.color = "black";
		car2.seat = 9;
		car2.gas_mileage = 13.1f;
		
		//car2 = car 1;
		car1.carPrint();
		car2.carPrint();
	}
}

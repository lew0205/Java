package chapter04;

class Car{
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

}

public class Cartest {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "50조 7064";
		car1.color = "black";
		car1.seat = 5;
		
		Car car2 = new Car();
		car2.name = "12나 1234";
		car2.color = "black";
		car2.seat = 9;
		car2.gas_mileage = 13.1f;
		
		car2 = car1;
		car1.carPrint();
		car2.carPrint();
	}
}
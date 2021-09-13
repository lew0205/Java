package chapter07;

public class Slass1 {

	public static void main(String[] args) {
		new Slass();
		new Slass();
		
		Slass s = new Slass();
		
		System.out.println(Slass.x);
		System.out.println(s.y);
	}

}

class Slass{
	static int x;
	int y;
	
	Slass(){
		x++;
		y++;
	}
}

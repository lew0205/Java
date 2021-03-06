package chapter04.test;

class Tv {
	boolean power;
	int volume;
	int channel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;

	void turnOnOff() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

	void volumenUp() {
		if (volume < MAX_VOLUME)
			volume++;
		else
			System.out.println("더 이상 볼륨을 높일 수 없습니다.");
	}

	void volumenDown() {
		if (volume > MIN_VOLUME)
			volume--;
		else
			System.out.println("더 이상 볼륨을 낮출 수 없습니다.");
	}
}

public class Tvtest {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.turnOnOff();
		t.channel = 10;
		t.volume = 99;
		t.channelDown();
		t.volumenUp();
		t.volumenUp();
		System.out.print("현재 채널은 " + t.channel);
		System.out.println(", 볼륨은 " + t.volume + "입니다");
	}
}
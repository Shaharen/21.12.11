package Exam02;

public class MyKart implements Kart {
	// 인터페이스에서 상속받은 추상 메소드는 반드시 구현해야줘야함

	int myposition = position;// MyKart가 생성되면 무조건 myposition이 0이다

	@Override
	public void go(int num) {
		System.out.println(myposition + num);
		
	}

	@Override
	public void back(int num) {
		System.out.println(myposition + num);

	}

	@Override
	public void booster(int power) {
		System.out.println(myposition + power);

	}

}

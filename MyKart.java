package Exam02;

public class MyKart implements Kart {
	// �������̽����� ��ӹ��� �߻� �޼ҵ�� �ݵ�� �����ؾ������

	int myposition = position;// MyKart�� �����Ǹ� ������ myposition�� 0�̴�

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

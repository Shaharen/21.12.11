package Exam02;

public interface Kart {
	
	// īƮ�� ���赵
	
	// ���� ��ġ = 0
	int position = 0; // ������ ���۵Ǵ� ��ġ
	// ������ ���� ���
	public abstract void go(int num); // num = �󸶸�ŭ ������ ������
	// �ڷ� ���� ���
	public abstract void back(int num); // num = �󸶸�ŭ �ڷ� ������
	// �ν��� ���
	// power = �ν��͸� �󸶳� ���� ����
	public abstract void booster(int power);
	
}

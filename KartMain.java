package Exam02;

import java.util.Random;
import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {

		MyKart spotage = new MyKart();
		// ù �������� 0 => spotage.myposition = 0
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int cnt = 0;
		int backnum = 0;

		System.out.println("���̵��� �����ϼ���");
		System.out.println(" 1. �ʱ� 2. �߱� 3. ����Ʈ�޾�");
		System.out.print("������ ���̵� >> ");
		int hard = sc.nextInt();
		System.out.println("�̸� �Է� >> ");
		String name = sc.next();

		if (hard == 1) {
			backnum = 1;
			System.out.println("������ ���̵��� �ʱ� �Դϴ�.");
		} else if (hard == 2) {
			backnum = 2;
			System.out.println("������ ���̵��� �߱� �Դϴ�.");
		} else {
			backnum = 10;
			System.out.println("�ϰ� ������ ����Ʈ�޾��.");
		}

		while (spotage.myposition < 100) {

			System.out.println("1. ���� 2. ���� 3. �ν��� 4. ����");
			cnt++;
//			int menu = random.nextInt(3) + 1;
			int menu = sc.nextInt();
			if (menu == 1) {
				// ���� ��ġ�� �Է°���ŭ ������ ������
				int num = random.nextInt(10) + 1;
				spotage.go(num);
				spotage.myposition += num;
			} else if (menu == 2) {
				// ���� ��ġ�� �Է°���ŭ �ڷ� ������
				int num = (random.nextInt(10) + 1) * (-backnum);
				spotage.back(num);
				spotage.myposition += num;
			} else if (menu == 3) {
				// ���� ��ġ�� 30+ ������ŭ ������ ������
				int booster = random.nextInt(10) + 10;
				System.out.println(booster);
				spotage.booster(booster);
				spotage.myposition += booster;
			} else if (menu == 4) {
				System.out.println("���� �Ͻðڽ��ϱ�?");
				System.out.println(" Y / N ");
				String a = sc.next();
				if (a.equals("Y")) {
					System.out.println("�����ϼ̽��ϴ�");
					System.out.println("�õ� Ƚ�� >> " + cnt);
					break;
				} else {
					System.out.println("�̾��ϱ�");
				}
			}
		}
		if (spotage.myposition >= 100) {
			System.out.println("���ּ���");
			System.out.println("������ �����մϴ�");
			System.out.println("�õ� Ƚ�� >> " + cnt);
		}

	}

}

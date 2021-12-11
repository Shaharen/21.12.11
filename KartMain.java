package Exam02;

import java.util.Random;
import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {

		MyKart spotage = new MyKart();
		// 첫 시작점은 0 => spotage.myposition = 0
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int cnt = 0;
		int backnum = 0;

		System.out.println("난이도를 선택하세요");
		System.out.println(" 1. 초급 2. 중급 3. 나이트메어");
		System.out.print("설정한 난이도 >> ");
		int hard = sc.nextInt();
		System.out.println("이름 입력 >> ");
		String name = sc.next();

		if (hard == 1) {
			backnum = 1;
			System.out.println("설정한 난이도는 초급 입니다.");
		} else if (hard == 2) {
			backnum = 2;
			System.out.println("설정한 난이도는 중급 입니다.");
		} else {
			backnum = 10;
			System.out.println("니가 선택한 나이트메어다.");
		}

		while (spotage.myposition < 100) {

			System.out.println("1. 전진 2. 후진 3. 부스터 4. 포기");
			cnt++;
//			int menu = random.nextInt(3) + 1;
			int menu = sc.nextInt();
			if (menu == 1) {
				// 차의 위치가 입력값만큼 앞으로 가야함
				int num = random.nextInt(10) + 1;
				spotage.go(num);
				spotage.myposition += num;
			} else if (menu == 2) {
				// 차의 위치가 입력값만큼 뒤로 가야함
				int num = (random.nextInt(10) + 1) * (-backnum);
				spotage.back(num);
				spotage.myposition += num;
			} else if (menu == 3) {
				// 차의 위치가 30+ 랜덤만큼 앞으로 가야함
				int booster = random.nextInt(10) + 10;
				System.out.println(booster);
				spotage.booster(booster);
				spotage.myposition += booster;
			} else if (menu == 4) {
				System.out.println("포기 하시겠습니까?");
				System.out.println(" Y / N ");
				String a = sc.next();
				if (a.equals("Y")) {
					System.out.println("포기하셨습니다");
					System.out.println("시도 횟수 >> " + cnt);
					break;
				} else {
					System.out.println("이어하기");
				}
			}
		}
		if (spotage.myposition >= 100) {
			System.out.println("완주성공");
			System.out.println("게임을 종료합니다");
			System.out.println("시도 횟수 >> " + cnt);
		}

	}

}

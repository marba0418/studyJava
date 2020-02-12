package kh.java.func;

import java.util.Scanner;
import java.util.Random;

public class BR {
	public void main() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===== 베스킨 라빈스 =====");
			System.out.println("1. GAME START");
			System.out.println("2. GAME SCORE");
			System.out.println("3. END GAME");
			System.out.print("선택>");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				startGame();
				break;
			case 2:
				score();
				break;
			case 3:
				return;// 리턴 만나는 순간 종료됨
			}
		}
	}

	public void startGame() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = 0;// 31까지 올라갈 변수
		System.out.println("<<<Game Start>>>");
		while (true) {
			System.out.println("<<<Your Turn>>>");
			System.out.println("InputNumber : ");
			int userNum = sc.nextInt();
			printCount(userNum, num);
			System.out.println("<<< com turn>>>");
			int comNum = r.nextInt(3) + 1;
			printCount(comNum, num);
		}

	}

	public void printCount(int count, int printNumber) {
		for (int i = 0; i < count; i++) {
			System.out.println(++printNumber + "!");
		}
	}

	public void score() {

	}

}

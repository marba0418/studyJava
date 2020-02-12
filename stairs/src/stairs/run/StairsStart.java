package stairs.run;

import stairs.func.StairsUp;
import java.util.Scanner;

public class StairsStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StairsUp plan = new StairsUp();
		while (true) {
			System.out.println("=====계단으로 올라가자upup=====");
			System.out.println("1.밥을 먹는다.");
			System.out.println("2.현재 몇층에 있는지?");
			System.out.println("3.계단을 올라갈까?");
			System.out.println("4.계단을 내려갈까?");
			System.out.println("선택>");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				boolean bool = plan.meal();
				if (bool) {
					System.out.println("냠냠");
				}else {
					System.out.println("배고파ㅠㅠ ");
				}break;
			case 2:
				if(plan.meal == true) {
					System.out.println("현재 몇층 :"+plan.stairs);
				}else {
					System.out.println("배고파ㅠㅠ");
				}break;
			case 3:
				if(plan.meal == true) {
					System.out.println("계단을 올라가자");
				}
			}
		}

	}

}

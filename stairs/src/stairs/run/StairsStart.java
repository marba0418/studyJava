package stairs.run;

import stairs.func.StairsUp;
import java.util.Scanner;

public class StairsStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StairsUp plan = new StairsUp();
		while (true) {
			System.out.println("=====������� �ö���upup=====");
			System.out.println("1.���� �Դ´�.");
			System.out.println("2.���� ������ �ִ���?");
			System.out.println("3.����� �ö󰥱�?");
			System.out.println("4.����� ��������?");
			System.out.println("����>");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				boolean bool = plan.meal();
				if (bool) {
					System.out.println("�ȳ�");
				}else {
					System.out.println("����ĤФ� ");
				}break;
			case 2:
				if(plan.meal == true) {
					System.out.println("���� ���� :"+plan.stairs);
				}else {
					System.out.println("����ĤФ�");
				}break;
			case 3:
				if(plan.meal == true) {
					System.out.println("����� �ö���");
				}
			}
		}

	}

}

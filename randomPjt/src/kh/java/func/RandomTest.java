package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public void random1() {
		Random r = new Random();
		int randomNumber = r.nextInt();// r.nestInt();���� ���ڻ��� ->������������ ����(int)
		// -2^31~2^31-1
		System.out.println(randomNumber);
		int randomNumber1 = r.nextInt(10);
		// 0���� 10�� ���� �� �������� ���� 0 1 2 34 5 6 7 8 9 ��
		System.out.println(randomNumber1);
		int randomNumber2 = r.nextInt(32);
		System.out.println(randomNumber2);
		// 0~9������ ���� �� : 8

		int randomNumber3 = r.nextInt(10);
		System.out.println(randomNumber3);
		// 0�Ǵ�1:1
		int randomNumber4 = r.nextInt(2);
		System.out.println(randomNumber4);
		// 1~10������ ���� ��

	}

	public void random2() {
		Random r = new Random();
		int ran1 = r.nextInt(10);// 0~9
		System.out.println(ran1);
		int ran2 = r.nextInt(10) + 1;// 1-10
		System.out.println(ran2);
		int ran3 = r.nextInt(16) + 20;// ()����+20�� ���۰� 20-35
		System.out.println(ran3);
		int ran4 = r.nextInt(2);// 0or 1
		System.out.println(ran4);
	}

	// ���� �� �� ���߱�
	// 1�Ǵ� 2�� ���� ���� ���� �ѵ� ����ڰ� �Է��� ���� ��
	// ���� �� �� ���߱�
	// ���ڸ� �Է����ּ���(1.�ո�/2.�޸�):1
	// ������ϴ�^^
	// ----------->restart
	// ���� �� �� ���߱�
	// ���ڸ� �Է����ּ���(1.�ո�/2.�޸�):1
	// ��! Ʋ�Ƚ��ϴ�.
	public void random3() {// �޼ҵ带 �����Ѵ�.
		Random r = new Random();// ������ ����? �Ѵ�.
		Scanner sc = new Scanner(System.in);// ��ĳ�ʸ� �����Ѵ�.
		while (true) {// while�� �Ʒ� �������� �ݺ��Ѵ�.
			// ���� 1,2�� 2���̰� 1���� �����ϹǷ� int ran1 = r.nextInt(2)+1;�� �����Ѵ�.
			int ran1 = r.nextInt(2) + 1;
			// ��°��� "���ڸ�~ �޸�)�� �־��ش�.
			System.out.println("���ڸ� �Է����ּ���(1.�ո�/2.�޸�): ");
			int num = sc.nextInt();// Ű����� ������ �Է��� �� �ִ�.
			if (ran1 == num) {// �Է��� ���ڿ� ��µǴ� ���� ���ڰ� �������
				System.out.println("������ϴ�^^");// ��°��� ��~^^
			} else {// �Է��� ���ڿ� ��µǴ� ���� ���ڰ� �ٸ����
				System.out.println("��! Ʋ�Ƚ��ϴ�.");// ��°��� "��!~"
			}
			System.out.print("�ѹ���[Y/N]");// ���� ������ �ѹ��� �����ϴ� ��°��� ���ش�.
			char sel = sc.next().charAt(0);// y�� n�� ���ڰ��̰� 1���ڸ� �ش�Ǳ⶧����
			// char sel�� ������ �����ϰ� sc.next().chartA(0);���� 1���ڸ� ����Ѵ�.
			if (sel == 'n') {// ���� sel�� n�ϰ�� break�� ����������,y�϶��� while���� ����(��� �ݺ�)
				break;
			}
		}
	}

	public void random4() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int ran1 = r.nextInt(3) + 1;
		System.out.println("���ڸ� �����ϼ���(1.����/2.����/3.��): ");
		// print
		int num = sc.nextInt();
		String str = "";// ���� ���ڿ� �񱳽� user.equals�� ǥ��
		// user.equals("����")�� ��,== ���� �ϸ� �ּҰ��� ���ڿ� �񱳰� �Ǿ� ���� �� ����
		// �յڰ� �ٲ� ������ "��".equals(com)
		// if(num==ran1) {
		// num = "����";
		// else if(num==2) {
		// num = "��"
		// else if(num==3) {

		/*
		 * } } System.out.println("�����"+num+"�� �½��ϴ�."); System.out.println("��ǻ�ʹ�"
		 * +ran1+"�� �½��ϴ�."); System.out.println("����� �����ϴ�."); }if(num<ran1||num>ran1) {
		 * System.out.println("�����"+num+"�� �½��ϴ�.");
		 * System.out.println("��ǻ�ʹ�"+ran1+"�� �½��ϴ�."); System.out.println("����� �����ϴ�.");
		 * }//if(user(userNum == comNum){ System.out.println("�����ϴ�.");
		 */

	}// ���� ���̽� ����/����,����/��,��/����
		// 1/2, 2/3,3/1
		// �� ����-��ǻ�ͼ��� =-1,2
		// else if(userNum-comNum==-1||userNum-comNum==2)
	/*
	 * public void random4(){ Random r = new Random(); Scanner sc = new
	 * Scanner(System.in); int comNum= r.nextInt(3)+1;
	 * system.out.println("���ڸ� �����ϼ���(1.����/2.����/3.��): "); int userNum = sc.nextInt();
	 * String str = ""; if(userNum == comNum){ userNum ="����"; else if(userNum
	 * ==comNum{ userNum ="����"; else if(userNum==comNum{ userNum ="��";
	 * system.out.println("�����"+userNum+"�� �½��ϴ�."); else if
	 * (userNum-comNum==-1&&userNum-comNum==2) system.out.println("����� �����ϴ�.") else
	 * if system.out.println("����� �̰���ϴ�.") //���� ���ڿ� �񱳽� user.equals�� ǥ��
	 * //user.equals("����")�� ��,==���� �ϸ� �ּҰ��� ���ڿ� �񱳰� �Ǿ� ���� �� ����.
	 */

	public void random44() {// ī��Ʈ�� ���߿� �սô�:)
		Random r = new Random();// ������ �����Ѵ�.
		Scanner sc = new Scanner(System.in);// ��ĳ�ʸ� �����Ѵ�.
		while (true) {// ���ǹ��� �°� �Ʒ� �ϴ��� �����Ѵ�.
			// up~>���ñ��� ���
			System.out.printf("==== Up& Down Game ====\n 1. Game Start \n 2. Game Score \n 3. End Game \n ���� >");
			int sel = sc.nextInt();// game start �տ� 1�� �������� int�� ���� �����ϰ� Ű���尪�� �Է��ϱ� ������ sc.nextInt�� ����.
			if (sel == 1) {// Ű���尪�� 1�� ���
				int ranNumber = r.nextInt(99) + 1;// 1~99���� ���� ���ڸ� �����Ѵ�.
				System.out.println("<< Game Start>>");// <<Game Start�� ����Ѵ�.
				while (true) {// while���� ���ǹ��� ������
					sel++;// �ݺ��Ҷ����� ȸ���� +1�ø��� �Ѵ�.
					// �ݺ��� ȸ����ȣ �Է� ���
					System.out.print(+(sel - 1) + "ȸ�� ��ȣ�Է� : ");
					int num = sc.nextInt();// ȸ�� ��ȣ �Է� ���� �ش��ϴ� ���� �Է��Ѵ�.

					if (ranNumber > num) {// ���� ���� ���ڰ� Ű���� �Է°����� ū���
						System.out.println("<<UP>>");// up�� ����Ѵ�.
					} else if (ranNumber < num) {// �� ������ false�̰� �������ڰ� num���� ���� ���
						System.out.println("<<DOWN>>");// Down�� ����Ѵ�.
					} else {// ���ǽ�1,���ǽ�2��� false�̸� ������ ����Ѵ�.
						System.out.println("<<����>>");
						break;// ������� ����� �ϸ� while�� �������´�.
					}
				}

			}

		}
	}

	public void random31() {// �޼ҵ带 �����Ѵ�.
		Random r = new Random();// ������ �����Ѵ�.
		Scanner sc = new Scanner(System.in);// ��ĳ�ʸ� �����Ѵ�.
		// "Baskin~Game~����>����Ѵ�.
		System.out.print("==== Baskin Robbins31 Game ==== \n 1.Game Start \n 2.Game Score \n 3.End Game \n ����>");
		// 1game Start,2score,3end game�� �ش��ϴ� ���� Ű����� �Է�&&������ ��������
		int sel = sc.nextInt();// Ű���� �Է°��� �����̹Ƿ� int ���� ���� �� sc.nextInt(); �Է��Ѵ�.
		if (sel == 1) {// ���� int ������ 1�� ���
			// �ߺ�for���� i,j�� Ƚ���� ����. ���������� ���� ������ �ƴ�. �׷��� int number =0;���� ���ڸ� ���������ش�.
			// int number�� 0������ �ϴ� ����
			int number = 0;
			System.out.println("<<Game Start>>");// Game Start���ڿ� ���
			while (true) {// ���ǽ��� true�϶� �ϴ��� �ݺ��Ѵ�.(while�� Ƚ���� �������� ����)
				System.out.println("<<Your Turn>>");// <<your turn>> ���

				System.out.println("Input Number :");// Input Number ���
				int num = sc.nextInt();
				// 1-3������ Ƚ���� �ݺ��ϱ� ���� �ʱ⹮�� int i =1,3���� ���ų� �����Ƿ� i<=num���� ������ ����;Ƚ���� i�� ++�ϸ鼭 1��
				// �������� �����.
				for (int i = 1; i <= num; i++) {
					number++;// ���ڸ� +1�ϱ� ���� number�� +1�� ���ϴ� ������ �����Ѵ�.
					System.out.println(number + "!");// ��°��� number�� ����!�� �־��ش�.
					if (number == 31) {// ���� inputnumber�� 31�̸�
						System.out.println("�й�Ф�");// �й� ���
						break;// 31������ for���� �������´�.
					}
				}if(number ==31) {
					break;
				}
				
				// <<computer Turn�� ����Ѵ�.
				System.out.println("<<Computer Turn>>");
				// ���� ����1~3���ڸ� �����Ƿ�
				// int�� �������� �����ϰ� r.nextInt(3)+1;(1���� �����ϹǷ�)
				int ranNumber = r.nextInt(3) + 1;
				// �ʱ⹮�� int j�� 1�� �����Ѵ�.(Ƚ��1���� �����̹Ƿ�)
				// ;j�� ������ ��������(1-3)�����̹Ƿ� ������ j<=ranNumber�� �����Ѵ�.
				// ���ǹ��� ������ j++�� Ƚ���� +1�� �����Ѵ�.
				for (int j = 1; j <= ranNumber; j++) {
					number++;// number++�� ���ڸ� +1�������Ѵ�.
					System.out.println(number + "!");// ��°��� number�� ����!�� �־��ش�.
					if (number == 31) {// ���� ���ڰ� 31�� ���´ٸ�
						System.out.println("�¸�!!");// �¸��� ����Ѵ�
						break;// 31�� ������ for���� �������´�.
					}

				}
				if (number == 31) {// ���� ���� ���� 31�� ���´ٸ�
					break;// break�� �Ἥ while�� �������´�.
				}
			}

		}

	}

	public void random32() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("==== Baskin Robbins31 Game ====\n 1.Game Start\n 2.Game Score\n 3.End Game\n ����>");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("<<Game Start>>");
			System.out.println("<<Your Turn>>");
			System.out.println("Input Number : ");

			int mynum = sc.nextInt();
			for (int i = 1; i <= mynum; i++) {
				System.out.println(i + "!");
				int ran = r.nextInt(3) + 1;
				for (int j = 1; j <= ran; j++) {
					System.out.println(j + "!");
				}

			}

		}

	}

	public void br31() {
		while (true) {
			System.out.println("===== Baskin Robbins31 Game =====");
			System.out.print("1. Game Start\n 2. Game Score\n 3.End Game");
			Scanner sc = new Scanner(System.in);
			int sel = sc.nextInt();
			System.out.println("���� >" + sel);
			if (sel == 1) {
				System.out.println("<< Game Start >>");
				System.out.println("<< Your Turn >>\n Input Number : ");
				int mynum = sc.nextInt();
				Random r = new Random();
				int com = r.nextInt(3) + 1;
				for (int i = 1; i <= mynum; i++) {
					for (int j = 1; com <= i; j++) {
						com++;
						System.out.println(i + "!");
						System.out.println("<<Computer Turn>>");
						System.out.println(com + "!");
						if (i >= 31) {
							System.out.println("�й�Ф�");
							break;
						}else if(com>=31) {
							System.out.println("�¸�!!!!");
							break;
						}
						break;
					}
				}

			}
		}
	}
	
}

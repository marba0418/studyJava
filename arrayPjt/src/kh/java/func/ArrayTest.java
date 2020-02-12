package kh.java.func;

import java.util.Scanner;

public class ArrayTest {
	public void arrayTest1() {
		// ������ ���� 5���� ������ �Ѵٸ�?
		int num1, num2, num3, num4, num5;
		// �迭�� ����ϸ�
		int[] num = new int[5];
		// num[0],num[1],num[2],num[3],num[4]
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		num[1] = 10;
		System.out.println(num[1]);
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		for (int i = 0; i < 5; i++) {
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {// i<5 �迭�� ����5���ϱ� ��ġ�� arr.length�� �ϸ� �迭 ���� �ٲ㵵 �ڵ����� �ٲ�
			System.out.print("�̸��� �Է��ϼ���  : ");
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void test1() {
		String[] arr = new String[5];
		arr[0] = "����";
		arr[1] = "������";
		arr[2] = "Ű��";
		arr[3] = "���";
		arr[4] = "�ٳ���";
		/*
		 * System.out.println(arr[4]); System.out.println(arr[0]);
		 * System.out.println(arr[1]); System.out.println(arr[2]);
		 * System.out.println(arr[3]); System.out.println(arr[4]);
		 */

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void test2() {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
	}

	public void test3() {
		int[] arr = new int[4];

		Scanner sc = new Scanner(System.in);

	}

	public void bobble() {
		int[] arr = { 5, 4, 2, 1, 3 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void room() {
		int[] arr = new int[10];
		while (true) {
			System.out.println("���� ���� ���α׷� v1.0");
			System.out.print("1.�Խ� \t 2.��� \t 3.�溸�� \t 4.����\n ���� > ");
			Scanner sc = new Scanner(System.in);

			int i = sc.nextInt();

			if (i == 3) {
				for (int j = 0; j < 10; j++) {
					if (arr[j] == 1) {
						System.out.println(j + 1 + "�� �濡�� ���� �մ��� �ֽ��ϴ�.");
					} else {
						System.out.println(j + 1 + "�� ���� ���� ����ֽ��ϴ�. ");
					}
				}
			}
			if (i == 1) {
				System.out.println("����濡 �Խ��Ͻðڽ��ϱ�? ");
				int room = sc.nextInt();
				if (arr[room - 1] == 1) {
					System.out.println(room + "������ ���� �մ��� �ֽ��ϴ�.");
				} else if (arr[room - 1] == 0) {
					System.out.println(room + "�� �濡 �Խ��ϼ̽��ϴ�.");
					arr[room - 1] = 1;// ����� �Խ������Ƿ� 1�� ����
				}

			}
			if (i == 2) {
				System.out.println("����濡�� ����Ͻðڽ��ϱ�? ");
				int exit = sc.nextInt();
				if (arr[exit - 1] == 1) {
					System.out.println(exit + "�� �濡�� ����ϼ̽��ϴ�.");
					arr[exit - 1] = 0;// ����� ��������Ƿ� 0�� ����
				} else if (arr[exit - 1] == 0) {
					System.out.println(exit + "������ ���� �� ���Դϴ�.");
				}
			}

		}

	}

	public void arrayTest2() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// ���� ����
		int[] arr2 = arr1;
		// �� �迭�� �ּҰ� ���
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// arr1 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 �迭 ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		arr1[2] = 100;
		arr2[1] = 300;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 �迭 ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

	public void arrayTest3() {// ���� ����

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];
		arr2 = arr1.clone();
		/*
		 * System.arraycopy�� �̿��� ���� ����(�Ϻε����� �����Ҷ� ���� ��) int[] arr2 = new
		 * int[arr1.length]; System.arraycopy(arr1,0,arr2,0,5);//������ 5�� ��� ��������.
		 * /*for���� �̿��� <��������> int[]arr2 = new int[arr1.length];//1�� �迭�� ���� ���� ���� for(int
		 * i=0;i<arr1.length;i++) { arr2[i]=arr1[i]; }
		 */
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// arr1 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 �迭 ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		arr1[2] = 100;
		arr2[1] = 300;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 �迭 ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

	}

	public void loop1() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + "" + j);
			}
		}
	}

	public void ifTest() {
		int num = 99;
		if (num % 2 == 0) {
			System.out.println("num�� ¦���̴�.");
		} else {
			System.out.println("num�� Ȧ���̴�.");
		}
	}

	public void elseIfTest() {
		int score = 50;
		char grade = ' ';
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println("���� :" + score + "���� : " + grade);
	}

	public void arrayTest6() {
		int[][] arr = new int[3][5];
		arr[0][3] = 10;
		arr[2][1] = 20;
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void motel() {
		int[] arr = new int[10];
		while (true) {
			System.out.println("���� ���� ���α׷� v1.0");
			System.out.println("1.�Խ�\t2.���\t3.�溸��\t4.����");
			System.out.println("����>");

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			if (i == 3) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == 0) {
						System.out.println(j + 1 + "������ ����ֽ��ϴ�");
					} else if (arr[j] == 1) {
						System.out.println(j + 1 + "���濡�� ���� �մ��� �ֽ��ϴ�");
					}
				}
			}
			if (i == 1) {
				System.out.println("����濡 �Խ��Ͻðڽ��ϱ�?");
				int room = sc.nextInt();
				if (arr[room - 1] == 1) {
					System.out.println(room + "�� ���� ���� �մ��� �ֽ��ϴ�");
				} else if (arr[room - 1] == 0) {
					System.out.println(room + "�� �濡 �Խ��ϼ̽��ϴ�");
					arr[room - 1] = 1;
				}
			}
			if (i == 2) {
				System.out.println("����濡�� ����Ͻðڽ��ϱ�?");
				int exit = sc.nextInt();
				if (arr[exit - 1] == 0) {
					System.out.println(exit + "������ ���� �� ���Դϴ�");
				} else if (arr[exit - 1] == 1) {
					System.out.println(exit + "���濡�� ����ϼ̽��ϴ�");
					arr[exit - 1] = 0;
				}
			}

		}

	}

}

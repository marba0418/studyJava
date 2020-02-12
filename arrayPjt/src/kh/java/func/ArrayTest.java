package kh.java.func;

import java.util.Scanner;

public class ArrayTest {
	public void arrayTest1() {
		// 정수형 변수 5개를 만들어야 한다면?
		int num1, num2, num3, num4, num5;
		// 배열을 사용하면
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
		for (int i = 0; i < arr.length; i++) {// i<5 배열의 길이5개니까 그치만 arr.length로 하면 배열 길이 바꿔도 자동으로 바뀜
			System.out.print("이름을 입력하세요  : ");
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void test1() {
		String[] arr = new String[5];
		arr[0] = "딸기";
		arr[1] = "복숭아";
		arr[2] = "키위";
		arr[3] = "사과";
		arr[4] = "바나나";
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
			System.out.println("모텔 관리 프로그램 v1.0");
			System.out.print("1.입실 \t 2.퇴실 \t 3.방보기 \t 4.종료\n 선택 > ");
			Scanner sc = new Scanner(System.in);

			int i = sc.nextInt();

			if (i == 3) {
				for (int j = 0; j < 10; j++) {
					if (arr[j] == 1) {
						System.out.println(j + 1 + "번 방에는 현재 손님이 있습니다.");
					} else {
						System.out.println(j + 1 + "번 방이 현재 비어있습니다. ");
					}
				}
			}
			if (i == 1) {
				System.out.println("몇번방에 입실하시겠습니까? ");
				int room = sc.nextInt();
				if (arr[room - 1] == 1) {
					System.out.println(room + "번방은 현재 손님이 있습니다.");
				} else if (arr[room - 1] == 0) {
					System.out.println(room + "번 방에 입실하셨습니다.");
					arr[room - 1] = 1;// 사람이 입실했으므로 1을 대입
				}

			}
			if (i == 2) {
				System.out.println("몇번방에서 퇴실하시겠습니까? ");
				int exit = sc.nextInt();
				if (arr[exit - 1] == 1) {
					System.out.println(exit + "번 방에서 퇴실하셨습니다.");
					arr[exit - 1] = 0;// 사람이 퇴실했으므로 0을 대입
				} else if (arr[exit - 1] == 0) {
					System.out.println(exit + "번방은 현재 빈 방입니다.");
				}
			}

		}

	}

	public void arrayTest2() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// 얕은 복사
		int[] arr2 = arr1;
		// 각 배열의 주소값 출력
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// arr1 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 배열 출력
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
		// arr2 배열 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

	public void arrayTest3() {// 깊은 복사

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];
		arr2 = arr1.clone();
		/*
		 * System.arraycopy를 이용한 깊은 복사(일부데이터 복사할때 쓰는 것) int[] arr2 = new
		 * int[arr1.length]; System.arraycopy(arr1,0,arr2,0,5);//마지막 5는 몇개를 복사할지.
		 * /*for문을 이용한 <깊은복사> int[]arr2 = new int[arr1.length];//1번 배열과 길이 같이 하자 for(int
		 * i=0;i<arr1.length;i++) { arr2[i]=arr1[i]; }
		 */
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// arr1 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 배열 출력
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
		// arr2 배열 출력
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
			System.out.println("num은 짝수이다.");
		} else {
			System.out.println("num은 홀수이다.");
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
		System.out.println("점수 :" + score + "학점 : " + grade);
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
			System.out.println("모텔 관리 프로그램 v1.0");
			System.out.println("1.입실\t2.퇴실\t3.방보기\t4.종료");
			System.out.println("선택>");

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			if (i == 3) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == 0) {
						System.out.println(j + 1 + "번방이 비어있습니다");
					} else if (arr[j] == 1) {
						System.out.println(j + 1 + "번방에는 현재 손님이 있습니다");
					}
				}
			}
			if (i == 1) {
				System.out.println("몇번방에 입실하시겠습니까?");
				int room = sc.nextInt();
				if (arr[room - 1] == 1) {
					System.out.println(room + "번 방은 현재 손님이 있습니다");
				} else if (arr[room - 1] == 0) {
					System.out.println(room + "번 방에 입실하셨습니다");
					arr[room - 1] = 1;
				}
			}
			if (i == 2) {
				System.out.println("몇번방에서 퇴실하시겠습니까?");
				int exit = sc.nextInt();
				if (arr[exit - 1] == 0) {
					System.out.println(exit + "번방은 현재 빈 방입니다");
				} else if (arr[exit - 1] == 1) {
					System.out.println(exit + "번방에서 퇴실하셨습니다");
					arr[exit - 1] = 0;
				}
			}

		}

	}

}

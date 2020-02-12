package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public void random1() {
		Random r = new Random();
		int randomNumber = r.nextInt();// r.nestInt();랜덤 숫자생성 ->정수형범위와 동일(int)
		// -2^31~2^31-1
		System.out.println(randomNumber);
		int randomNumber1 = r.nextInt(10);
		// 0부터 10개 숫자 중 랜덤숫자 추출 0 1 2 34 5 6 7 8 9 중
		System.out.println(randomNumber1);
		int randomNumber2 = r.nextInt(32);
		System.out.println(randomNumber2);
		// 0~9까지의 랜덤 수 : 8

		int randomNumber3 = r.nextInt(10);
		System.out.println(randomNumber3);
		// 0또는1:1
		int randomNumber4 = r.nextInt(2);
		System.out.println(randomNumber4);
		// 1~10까지의 랜덤 수

	}

	public void random2() {
		Random r = new Random();
		int ran1 = r.nextInt(10);// 0~9
		System.out.println(ran1);
		int ran2 = r.nextInt(10) + 1;// 1-10
		System.out.println(ran2);
		int ran3 = r.nextInt(16) + 20;// ()개수+20은 시작값 20-35
		System.out.println(ran3);
		int ran4 = r.nextInt(2);// 0or 1
		System.out.println(ran4);
	}

	// 동전 앞 뒤 맞추기
	// 1또는 2의 랜덤 수를 추출 한뒤 사용자가 입력한 값과 비교
	// 동전 앞 뒤 맞추기
	// 숫자를 입력해주세요(1.앞면/2.뒷면):1
	// 맞췄습니다^^
	// ----------->restart
	// 동전 앞 뒤 맞추기
	// 숫자를 입력해주세요(1.앞면/2.뒷면):1
	// 땡! 틀렸습니다.
	public void random3() {// 메소드를 선언한다.
		Random r = new Random();// 랜덤을 선언? 한다.
		Scanner sc = new Scanner(System.in);// 스캐너를 설정한다.
		while (true) {// while은 아래 문구들을 반복한다.
			// 정수 1,2가 2개이고 1부터 시작하므로 int ran1 = r.nextInt(2)+1;로 선언한다.
			int ran1 = r.nextInt(2) + 1;
			// 출력값을 "숫자를~ 뒷면)을 넣어준다.
			System.out.println("숫자를 입력해주세요(1.앞면/2.뒷면): ");
			int num = sc.nextInt();// 키보드로 정수를 입력할 수 있다.
			if (ran1 == num) {// 입력한 숫자와 출력되는 랜덤 숫자가 같을경우
				System.out.println("맞췄습니다^^");// 출력값은 맞~^^
			} else {// 입력한 숫자와 출력되는 랜덤 숫자가 다를경우
				System.out.println("땡! 틀렸습니다.");// 출력값은 "땡!~"
			}
			System.out.print("한번더[Y/N]");// 위의 진행을 한번더 진행하는 출력값을 써준다.
			char sel = sc.next().charAt(0);// y나 n은 문자값이고 1글자만 해당되기때문에
			// char sel로 변수를 선언하고 sc.next().chartA(0);으로 1글자만 출력한다.
			if (sel == 'n') {// 만약 sel이 n일경우 break로 빠져나오고,y일때는 while문에 갇힘(계속 반복)
				break;
			}
		}
	}

	public void random4() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int ran1 = r.nextInt(3) + 1;
		System.out.println("숫자를 선택하세요(1.가위/2.바위/3.보): ");
		// print
		int num = sc.nextInt();
		String str = "";// 만약 문자열 비교시 user.equals로 표현
		// user.equals("가위")로 비교,== 으로 하면 주소값과 문자열 비교가 되어 구할 수 없음
		// 앞뒤가 바뀌어도 괜찮음 "보".equals(com)
		// if(num==ran1) {
		// num = "가위";
		// else if(num==2) {
		// num = "보"
		// else if(num==3) {

		/*
		 * } } System.out.println("당신은"+num+"를 냈습니다."); System.out.println("컴퓨터는"
		 * +ran1+"를 냈습니다."); System.out.println("당신은 비겼습니다."); }if(num<ran1||num>ran1) {
		 * System.out.println("당신은"+num+"를 냈습니다.");
		 * System.out.println("컴퓨터는"+ran1+"를 냈습니다."); System.out.println("당신은 졌습니다.");
		 * }//if(user(userNum == comNum){ System.out.println("비겼습니다.");
		 */

	}// 지는 케이스 가위/바위,바위/보,보/가위
		// 1/2, 2/3,3/1
		// 내 숫자-컴퓨터숫자 =-1,2
		// else if(userNum-comNum==-1||userNum-comNum==2)
	/*
	 * public void random4(){ Random r = new Random(); Scanner sc = new
	 * Scanner(System.in); int comNum= r.nextInt(3)+1;
	 * system.out.println("숫자를 선택하세요(1.가위/2.바위/3.보): "); int userNum = sc.nextInt();
	 * String str = ""; if(userNum == comNum){ userNum ="가위"; else if(userNum
	 * ==comNum{ userNum ="바위"; else if(userNum==comNum{ userNum ="보";
	 * system.out.println("당신은"+userNum+"를 냈습니다."); else if
	 * (userNum-comNum==-1&&userNum-comNum==2) system.out.println("당신은 졌습니다.") else
	 * if system.out.println("당신은 이겼습니다.") //만약 문자열 비교시 user.equals로 표현
	 * //user.equals("가위")로 비교,==으로 하면 주소값과 문자열 비교가 되어 구할 수 없음.
	 */

	public void random44() {// 카운트는 나중에 합시당:)
		Random r = new Random();// 랜덤을 설정한다.
		Scanner sc = new Scanner(System.in);// 스캐너를 설정한다.
		while (true) {// 조건문은 맞고 아래 하단을 실행한다.
			// up~>선택까지 출력
			System.out.printf("==== Up& Down Game ====\n 1. Game Start \n 2. Game Score \n 3. End Game \n 선택 >");
			int sel = sc.nextInt();// game start 앞에 1이 정수여서 int로 정수 선언하고 키보드값을 입력하기 때문에 sc.nextInt를 쓴다.
			if (sel == 1) {// 키보드값이 1인 경우
				int ranNumber = r.nextInt(99) + 1;// 1~99까지 랜덤 숫자를 선언한다.
				System.out.println("<< Game Start>>");// <<Game Start를 출력한다.
				while (true) {// while안의 조건문이 맞을때
					sel++;// 반복할때마다 회차를 +1올리게 한다.
					// 반복시 회차번호 입력 출력
					System.out.print(+(sel - 1) + "회차 번호입력 : ");
					int num = sc.nextInt();// 회차 번호 입력 값에 해당하는 값을 입력한다.

					if (ranNumber > num) {// 만약 랜덤 숫자가 키보드 입력값보다 큰경우
						System.out.println("<<UP>>");// up을 출력한다.
					} else if (ranNumber < num) {// 위 조건이 false이고 랜덤숫자가 num보다 작은 경우
						System.out.println("<<DOWN>>");// Down을 출력한다.
					} else {// 조건식1,조건식2모두 false이면 정답을 출력한다.
						System.out.println("<<정답>>");
						break;// 정답까지 출력을 하면 while을 빠져나온다.
					}
				}

			}

		}
	}

	public void random31() {// 메소드를 선언한다.
		Random r = new Random();// 랜덤을 설정한다.
		Scanner sc = new Scanner(System.in);// 스캐너를 설정한다.
		// "Baskin~Game~선택>출력한다.
		System.out.print("==== Baskin Robbins31 Game ==== \n 1.Game Start \n 2.Game Score \n 3.End Game \n 선택>");
		// 1game Start,2score,3end game중 해당하는 숫자 키보드로 입력&&정수형 변수선언
		int sel = sc.nextInt();// 키보드 입력값이 정수이므로 int 변수 선언 및 sc.nextInt(); 입력한다.
		if (sel == 1) {// 만약 int 변수가 1인 경우
			// 중복for문에 i,j는 횟수만 증가. 실질적으로 숫자 증가가 아님. 그래서 int number =0;으로 숫자를 증가시켜준다.
			// int number에 0대입을 하는 것임
			int number = 0;
			System.out.println("<<Game Start>>");// Game Start문자열 출력
			while (true) {// 조건식이 true일때 하단을 반복한다.(while은 횟수가 정해지지 않음)
				System.out.println("<<Your Turn>>");// <<your turn>> 출력

				System.out.println("Input Number :");// Input Number 출력
				int num = sc.nextInt();
				// 1-3값으로 횟수를 반복하기 위해 초기문을 int i =1,3까지 같거나 작으므로 i<=num으로 조건을 설정;횟수는 i에 ++하면서 1씩
				// 증가문을 만든다.
				for (int i = 1; i <= num; i++) {
					number++;// 숫자를 +1하기 위해 number에 +1을 구하는 연산을 설정한다.
					System.out.println(number + "!");// 출력값은 number에 문자!를 넣어준다.
					if (number == 31) {// 만약 inputnumber가 31이면
						System.out.println("패배ㅠㅠ");// 패배 출력
						break;// 31나오면 for문을 빠져나온다.
					}
				}if(number ==31) {
					break;
				}
				
				// <<computer Turn을 출력한다.
				System.out.println("<<Computer Turn>>");
				// 컴은 랜덤1~3숫자를 넣으므로
				// int로 정수형을 선언하고 r.nextInt(3)+1;(1부터 시작하므로)
				int ranNumber = r.nextInt(3) + 1;
				// 초기문은 int j는 1로 설정한다.(횟수1부터 시작이므로)
				// ;j의 범위는 랜덤숫자(1-3)까지이므로 범위를 j<=ranNumber로 설정한다.
				// 조건문이 맞으면 j++로 횟수를 +1씩 증가한다.
				for (int j = 1; j <= ranNumber; j++) {
					number++;// number++로 숫자를 +1씩증가한다.
					System.out.println(number + "!");// 출력값을 number에 문자!를 넣어준다.
					if (number == 31) {// 만약 숫자가 31이 나온다면
						System.out.println("승리!!");// 승리로 출력한다
						break;// 31이 나오면 for문을 빠져나온다.
					}

				}
				if (number == 31) {// 만약 게임 값이 31이 나온다면
					break;// break를 써서 while을 빠져나온다.
				}
			}

		}

	}

	public void random32() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("==== Baskin Robbins31 Game ====\n 1.Game Start\n 2.Game Score\n 3.End Game\n 선택>");
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
			System.out.println("선택 >" + sel);
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
							System.out.println("패배ㅠㅠ");
							break;
						}else if(com>=31) {
							System.out.println("승리!!!!");
							break;
						}
						break;
					}
				}

			}
		}
	}
	
}

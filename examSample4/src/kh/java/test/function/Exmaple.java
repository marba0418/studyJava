package kh.java.test.function;

import java.util.Scanner;

public class Exmaple {
	public void exam1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		int sum = kor + eng + math;
		double avg = sum / (double) 3;
		boolean bool1 = avg >= 60;
		boolean bool2 = kor >= 40;
		boolean bool3 = eng >= 40;
		boolean bool4 = math >= 40;
		boolean result = bool1 && bool2 && bool3 && bool4;
		System.out.println(result ? "합격" : "불합격");

	}

	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int number = sc.nextInt();
		System.out.println(number % 2 == 0 ? "짝수" : "홀수");
	}

	public void exam3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("10을 입력해보세요 : ");
		int inputNumber = sc.nextInt();
		if (inputNumber == 10) {
			System.out.println("잘했어요");

		}

	}

	public void exam4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력 하세요 : ");
		int num1 = sc.nextInt();
		if (num1 > 0) {
			System.out.println("당신이 입력한 수 num1은(는) 양수입니다.");
		}
		if (num1 == 0) {
			System.out.println("당신이 입력한 수num1은(는) 0입니다. ");
		}
		if (num1 < 0) {
			System.out.println("당신이 입력한 수num1은(는) 음수입니다.");
		}

	}

	public void exam5() {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력 하세요 : ");
		int firstnum = sc.nextInt();
		System.out.println("두번째 정수를 입력 하세요 : ");
		int secondnum = sc.nextInt();
		if (firstnum < secondnum) {
			System.out.printf("firstnum<secondnum, 두번째 수가 더 큽니다.");
		}
		if (firstnum == secondnum) {
			System.out.printf("firstnum<secondnum, 두 수가 같습니다.");
		}
		if (firstnum > secondnum) {
			System.out.printf("firstnum>secondnum, 첫번째 수가 더 큽니다.");
		}
	}

	public void exam6() {

		Scanner sc = new Scanner(System.in);
		System.out.println("연산자를 입력하세요(+,-,*,/) :");
		char ch = sc.next().charAt(0);
		int first1 = sc.nextInt();
		System.out.println("첫번째 정수를 입력 하세요 : ");
		int sec = sc.nextInt();
		System.out.println("두번째 정수를 입력 하세요 : ");
		if (ch == '+') {
			System.out.println(first1 + "+" + sec + "=" + (first1 + sec));
		} // ("%d%c%d=%d",first1,ch,sec,first+sec);
		if (ch == '-') {
			System.out.println(first1 + "-" + sec + "=" + (first1 - sec));
		}
		if (ch == '*') {
			System.out.println(first1 + "*" + sec + "=" + (first1 * sec));
		}
		if (ch == '/') {
			System.out.printf("%d/%d=%f", first1, sec, (double) first1 / sec);
		}

	}

	public void exam7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		if (number % 2 == 1) {
			System.out.println("홀수입니다.");
		}
	}

	public void exam8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입장하실 총 인원은 몇명입니까? : ");
		int count = sc.nextInt();
		System.out.println("어른은 몇명입니까?(1인당 15000원) : ");
		int adult = sc.nextInt();
		System.out.println("아이는 몇명입니까?(1인당 5000원) : ");
		int child = sc.nextInt();
		if (adult + child == 3) {
			System.out.println("지불하실 총 금액은 35000원 입니다.");
		} else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}

	public void exam9() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫번째 퀴즈\n사과는 영어로 무엇일까요(1.apple,2.스티브 잡스)?");
		int first = sc.nextInt();
		int count = 0;
		if (first == 1) {
			count++;
			System.out.println("정답!!!");
		} else {
			System.out.println("땡!!");
		}
		System.out.printf("두번째 퀴즈\n바나나는 길어 길으면 기차 기차는 (1.비싸,2.빨라)?");
		int banana = sc.nextInt();
		if (banana == 2) {
			count++;
			System.out.println("정답!!!");
		} else {
			System.out.println("땡!!");
		}
		System.out.println("총" + count + "문제를 맞췄습니다.");
	}

	public void exam10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 술을 좋아합니까?");
		int an1 = sc.nextInt();
		if (an1 == 1) {
			System.out.print("당신은 담배를 피웁니까?");
			int an2 = sc.nextInt();
			if (an2 == 1) {
				System.out.println("담배는몸에 좋지 않습니다.");
			} else {
				System.out.println("술은 간에 좋지 않습니다.");
			}
		} else {
			System.out.print("이성친구가 있습니까?");
			int an3 = sc.nextInt();
			if (an3 == 1) {
				System.out.println("올ㅋ");
			} else {
				System.out.println("ㅠㅠ");
			}
		}
	}

	public void exam11() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이 수를 입력하세요 : ");
		int number = sc.nextInt();
		if (number == 1) {
			System.out.println("One");
		} else if (number == 2) {
			System.out.println("Two");
		} else if (number == 3) {
			System.out.println("Three");
		} else {
			System.out.println("잘못입력했습니다.");
		}
	}

	public void exam12() {

		Scanner sc = new Scanner(System.in);
		System.out.println("========= 대/소문자 변환 프로그램=========");
		System.out.println("문자입력 : ");
		char ch = sc.next().charAt(0);
		if (65 <= ch && ch <= 92) {
			System.out.println("대문자 입력함");
			System.out.println("소문자로 변환" + (char) (ch ^ 32));
		} else if (97 <= ch && ch <= 122) {
			System.out.println("소문자 입력함");
			System.out.println("대문자로 변환" + (char) (ch ^ 32));
		} else {
			System.out.println("잘못입력");
		}
	}

	/*
	 * public void exam13() {
	 * 
	 * Scanner sc = new Scanner(System.in);//스캐너 가져오기
	 * System.out.println("정수입력 : ");//정수입력 출력
	 * System.out.println("===== 결과 =====");//결과 출력 int num2 = sc.nextInt();//입력시
	 * num2 if((num2/3)&&(num2/4)==0) {//3의 배수이면서 4의 배수인 수들은 3과 4로 나누었을 때 0와 같다.
	 * System.out.println(); }
	 * 
	 * Scanner sc =new Scanner(System.in); System.out.print("정수입력 : "); //3의 배수 ->
	 * 3으로 나눴을 때 나머지가 0 //4의 배수 ->4로 나눴을 때 나머지가 0 //3&&4 -> if(num2==0) {
	 * System.out.println("둘다아님"); }else if(num2%3==0&&num2%4==0)
	 * System.out.printf("[%d]은(는) 3의 배수이면서 4의 배수입니다."); }else if(num2%3==0) {
	 * System.out.printf("[%d]은(는) 3의 배수입니다."); }else if(num2%4==0) {
	 * System.out.printf("[%d]은(는) 4의 배수입니다."); }else { System.out.println("둘다아님");
	 * }
	 * 
	 * 
	 * public void exam14() { Scanner sc = new Scanner(System.in);
	 * System.out.print("1~3사이의 수 입력 : "); int num = sc.nextInt(); switch(num) {
	 * case 1 : System.out.println("1을 입력"); break; case 2 :
	 * System.out.println("2를 입력"); break; case 3 : System.out.println("3을 입력");
	 * break; default : System.out.println("잘못입력"); } }
	 */
	public void exam15() {// 메소드 실행
		Scanner sc = new Scanner(System.in);// 스캐너 실행
		System.out.print("일수를 알고싶은 달을 입력하세요 : ");// 일수를~입력하세요 출력
		int number = sc.nextInt();// 정수형 변수 선언
		
		switch (number) {//if랑 같은 위 int에서 number 변수로 선언하고,switch에서 number 받고,case가 if랑 같음.. 그러면 case 1은 if(number =1)인 경우..이런식으로 조건이 달리는 거임..
		case 1:
			System.out.println(number + "월달은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println("2월달은 29일까지 있습니다.");
			break;
		case 3:
			System.out.println("3월달은 31일까지 있습니다.");
			break;
		case 4:
			System.out.println("4월달은 30일까지 있습니다.");
			break;
		case 5:
			System.out.println("5월달은 31일까지 있습니다.");
			break;
		case 6:
			System.out.println("6월달은 30일까지 있습니다.");
			break;
		case 7:
			System.out.println("7월달은 31일까지 있습니다.");
			break;
		case 8:
			System.out.println("8월달은 31일까지 있습니다.");
			break;
		case 9:
			System.out.println("9월달은 30일까지 있습니다.");
			break;
		case 10:
			System.out.println("10월달은 31일까지 있습니다.");
			break;
		case 11:
			System.out.println("11월달은 30일까지 있습니다.");
			break;
		case 12:
			System.out.println("12월달은 31일까지 있습니다.");
			break;
		}

	}

	public void exam16() {// 메소드 입력
		Scanner sc = new Scanner(System.in);// 스캐너 가져오기
		// 장학금 지불 시스템과 학점표현하는 문구 입력하기 위해 printf입력함
		System.out.printf("장학금 지불 시스템입니다\n학점을 입력하세요(A,B,C,D,F) : ");
		char ch = sc.next().charAt(0);// sc.next()(띄어쓰기 있으면 못읽어옴).charAt(0)을 통해서 문자를 입력받아 / 문자형 변수 ch에 대입
		if (ch == 'A') {	//입력받은 문자가 A인 경우
			// 학점A부터 시작하고 해당성적이 아닌경우 B,C,D,F로 조건값이 내려갈 수 있게 입력
			// 조건 A학점에 부합하여 장학금100지급 출력
			System.out.println("수고하셨습니다. 장학금을 100%지급해드리겠습니다.");
		} else if (ch == 'B') {			// 학점A가 아닌 해당성적 중 B학점에 해당하는 경우
			System.out.println("아쉽군요. 장학금을 50%지급해드리겠습니다.");
		} else if (ch == 'C') {// 학점이 A,B둘다 아닌경우 중 C에 해당하는 경우
			System.out.println("장학금을 바라시면 좀더 열심히 해주세요.");// C학점에 해당하는 내용 출력
		} else if (ch == 'D') {// 학점이 A,B,C 셋 다 아닌 경우 중 D에 해당하는 경우
			System.out.println("크흠.......");// D학점 해당 내용 출력
		} else {// 학점이 A,B,C,D 네가지에 1개도 해당하는 경우가 없는 경우
			System.out.println("학사경고입니다!!!!");// A~D까지 학점에 해당하지 않는 경우는 F성적이며 그에 해당하는 결과 출력
		}

	}
	public void exam161(){//메소드 입력
		Scanner sc = new Scanner(System.in);// 스캐너 가져오기
		//장학금 지불~학점 표현 문구 입력하기 위해 printf입력함
		System.out.printf("장학금 지불 시스템입니다\n학점을 입력하세요(A,B,C,D,F) : ");
		char ch = sc.next().charAt(0);//sc.next().charAt(0)을 통해서 문자를 입력받아/ 문자형 변수 ch에 대입
		switch(ch) {//switch
		}
	}

	public void exam17() {// 메소드 입력
		Scanner sc = new Scanner(System.in);// 스캐너 가져오기
		System.out.print("======== 계산기 프로그램 ========");// 계산기프로그램 출력
		char ch = sc.next().charAt(0);// 연산자는 문자이기에 차형 변수 선언
		System.out.println("연산자를 입력하세요(+,-,*,/) ");// 연산자를 입력하세요 줄변경출력
		int num = sc.nextInt();// 첫번째 정수 정수형 변수 선언
		int num1 = sc.nextInt();// 두번째 정수 정수형 변수 선언

		if (ch == '+') {// 연산자가 +인경우를 가정
			System.out.print("첫번째 정수를 입력 하세요 : " + num);// 첫번째 정수를 입력 하세요 와 정수값 출력
			System.out.print("두번째 정수를 입력 하세요 : " + num1);// 두번째 정수를 입력하세요와 해당 정수값 출력
			System.out.printf("%d%c%d=%d", num, ch, num1);// 연산자가 +인경우 계산식 출력
		}

		else if (ch == '-') {// 연산자가 -인경우를 가정
			System.out.print("첫번째 정수를 입력 하세요 : " + num);// 첫번째 정수를 입력하세요와 정수값 출력
			System.out.print("두번째 정수를 입력 하세요 : " + num1);// 두번째 정수를 입력하세요와 해당 정수값 출력
			System.out.printf("%d%c%d=%d", num, ch, num1);// 연산자가 -인경우 계산식 출력
		} else if (ch == '*') {// 연산자가 *인경우를 가정
			System.out.print("첫번째 정수를 입력 하세요 : " + num);// 첫번째 정수를 입력하세요와 정수값 출력
			System.out.print("두번째 정수를 입력 하세요 : " + num1);// 두번째 정수를 입력하세요와 해당 정수값 출력
			System.out.printf("%d%c%d=%d", num, ch, num1);// 연산자가 *인경우 계산식 출력
		} else {// 연산자가 +-*아닌 경우
			System.out.print("첫번째 정수를 입력 하세요 : " + num);// 첫번째 정수를 입력하세요와 정수값 출력
			System.out.print("두번째 정수를 입력 하세요 : " + num1);// 두번째 정수를 입력하세요와 해당 정수값 출력
			System.out.printf("%d%c%d=%.2f(%d)", num, ch, num1);// 연산자가 +-*아닌 경우 계산식 출력
		}
	}

	public void exam18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 : ");// 점수 입력 출력
		int point = sc.nextInt();// 성적 변수 입력
		if (point > 0 && point < 0) {// 성적이 0~100사이가 아닌 경우
			System.out.println("잘못된 입력(0~100사이 입력)");// 성적이0~100사이 아닌값 출력됨
		} else if (point >= 90) {// 성적이90점이상 인 경우
			System.out.println(+point + "점==>A등급"); // A등급 출력됨
		} else if (point >= 80) {// 성적이80점이상인 경우
			System.out.println(+point + "점==>B등급");// B등급 출력됨
		} else if (point >= 70) {// 성적이70점이상인 경우
			System.out.println(+point + "점==>C등급");// C등급 출력됨
		} else if (point >= 60) {// 성적이60점이상인 경우
			System.out.println(+point + "점==>D등급");// D등급 출력됨
		} else {// 성적이 60점미만(나머지 값들)인경우
			System.out.println(+point + "점==>F등급");// F등급 출력됨

		}
	}

	//쌤이랑 푼거
	public void exam181() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 : ");
		int score = sc.nextInt();
		int grade = score/10;//98을 10으로 나누면?9
		if(score == 100) {//100점인 경우
			System.out.println("A등급");
		}else if(score>100||score<0) {
			System.out.println("잘못된 입력");
		}else {
		switch(grade) {//swich안에 if 써도 됨
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		case 5:
			System.out.println("F등급");
			break;
		default	: System.out.println("잘못된 입력(0~100사이 입력)");
		}
	}
	}
	
	
}

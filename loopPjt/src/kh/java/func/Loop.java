package kh.java.func;

import java.util.Scanner;

public class Loop {
	public void forTest() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 출력");

		}
		for (int i = 1; i <= 5; i++) {// i를 선언하면 계속 쓸수 있다?
			int test = 30;
		}
	}

	public void forTest1() {
		for (int i = 5; i > 0; i--) {
			System.out.println(i + "번째 출력");

		}
	}

	public void forTest2() {// 메소드 선언
		for (int i = 1; i <= 5; i++)// for문으로 초기문 int i=
			System.out.println("안녕하세요");

	}

	public void whileTest() {
		int i = 1;
		while (i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
	}

	public void forTest3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 출력하시겠습니까? ");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("안녕하세요");
		}
	}

	public void whileTest1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 출력하시겠습니까? ");
		int number = sc.nextInt();
		int i =1;
		while(i<=number) {
			System.out.println("안녕하세요");
			i++;
		}
		

	}

	public void forTest4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2단입니다.");

		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + "=" + (2 * i));
		}
	}
	public void whileTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2단입니다.");
		int i =1;
		while(i<=9) {
			System.out.println("2 *" +i+ "=" +(2*i));
			i++;
		}
	}

	public void forTest5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력하시겠습니까? ");
		int num2 = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(num2 + " * " + i + "=" + (num2 * i));

		}

	}
	public void whileTest5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력하시겠습니까? ");
		int num2 = sc.nextInt();
		int i = 1;
		while(i<=9) {
			System.out.println(num2 + "*" + i + "=" +(num2*i));
			i++;
		}
	}

	public void forTest6() {
		Scanner sc = new Scanner(System.in);
		// 초기화 값을 선언해야함. 변수 (하나의 빈공간)모두 더하는 거고 그러면 0으로 초기화해야 합계가 정확함
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			sum += num;

		}
		// for문에서 나와야 sys~실행됨, num도 for문에서 썼기때문에 다른 문자 써야함
		System.out.println("입력한 5개의 정수의 합 : " + (sum));
		
	}
	public void whileTest6() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		
		while(i<=5) {
			System.out.println("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			i++;
			sum += num;
		}System.out.println("입력한 5개의 정수의 합 : "+(sum));
	}

	public void forTest7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력 : ");
		int num = sc.nextInt();
		System.out.println("두번째 수 입력 : ");
		int num1 = sc.nextInt();
		int sum = 0;
		for (int i = num; i <= num1; i++) {
			sum += i;

		}
		System.out.println("10~20의  정수의 합 : " + (sum));

	}
	public void whileTest7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력 : ");
		int num = sc.nextInt();
		System.out.println("두번째 수 입력 : ");
		int num1 = sc.nextInt();
		int sum = 0;
		int i = num;
		while(i<=num1) {
			sum += i;
			i++;
		}
		System.out.println("10~20의 정수의 합  "+(sum));
	}
		
		
		
		
	
	

	public void forTest8() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println("i = " + i + "/ j = " + j);
			}
		}
	}
	

	public void loopTest() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("반복");
			System.out.print("한번더[y/n]?");
			char ch = sc.next().charAt(0);
			if (ch == 'n') {
				break;
			}

		}
		System.out.println("test");
	}

	public void loopTest2() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ".출력");
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("홀수");
		}
		System.out.println("test2");
	}

	public void forTest9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int sum = 0;
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println("짝수들의 합은 : " + (sum));

	}
	public void whileTest9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
			while(i<=num) {
				if(i%2==0) {
				sum +=i;
				}
				i++;
			}
		System.out.println("짝수들의 합은 : "+(sum));
		}
		

	//중첩 for문 내부의 명령을 외부의 횟수만큼 반복	,표현for(초기문;조건문;증감문)
	public void dfor1() {//메소드를 선언한다.
		//구구단 시작은 2부터이므로 시작점을 int i=2로 선언하고
		//범위는 2부터 9까지 같거나 작으므로 <=9로 조건을 건다.
		//곱해지는 시작점이 2이고 2부터 
		for(int i=2;i<=9;i++) {
			//i에 1부터 9까지 곱하기 위해 시작하는 정수를 int j=1로 선언하고,
			//범위는 9보다 같거나 작으므로 <=9로 조건을 건다.
			//곱해지는 시작점이 1이고 1부터 9까지 곱한 후 
			//2가 시작되어야 하므로 j++로 증감문을 입력한다.
			for(int j=1;j<=9;j++) {
				//출력값을 한줄에 써주고 띄어쓰기\t를 해준다.
				System.out.print(i+"*"+j+"=" +(i*j)+"\t");
			//2단이 마치면 3단이 출력되도록 println을 넣어준다.	
			}System.out.println();
		}
		
		
	}
	public void dfor2() {//메소드를 선언한다.
		//1부터 곱해야 하므로 시작점을 1로 한다.
		//범위는 1부터 9까지 곱하는 것이므로 1부터 9까지 범위를 정해 조건을 넣는다.
		//1부터 9까지 차례대로 +1씩  증가하므로 i++로 표현한다.
		for(int i=1;i<=9;i++) {
			//구구단 반대로 하기 위해 ? 2부터 시작점으로 변수를 선언한다.
			//범위는 2부터 9까지 이므로 조건을 설정한다.
			//2부터 9까지 +1씩 증가하기 위해 j++로 표현한다.
			for(int j=2;j<=9;j++) {
				//출력값을 한줄에 써주고 띄어쓰기\t를 해준다.
			System.out.print(j+"*"+i+"="+(j*i)+"\t");
			//2단이 마치면 3단이 올 수 있게 println을 넣어준다.
			}System.out.println();
		}
	}
	public void dfor3() {//메소드를 선언한다.
		//출력값이 *****이므로 반복 횟수가 5번이 나오도록 한다.
		//시작점을 1부터로 시작한다.
		//조건은 1부터 5까지 5번 반복 해야하므로 1-5까지
		//i가 5보다 작거나 같음으로 조건을 건다.
		//시작점 1을 넣고 조건이 맞으면 차례대로 +1씩 증가하므로 i++로 증감문을 넣는다.
		for(int i =1;i<=5 ;i++ ) {
			for(int j =1;j<=5;j++) {
				System.out.print("*");//출력값이 *이 나오고 한줄로 출력하기 위해 print를 쓴다.
			}
			System.out.println();// 			
		}
		
	}
	public void dfor4() {//메소드를 선언한다.
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}System.out.println();
		}
		
	}
	public void dfor5() {
		  for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);	
			}
			System.out.println(" ");
			
		}
		
	}
	public void dfor6() {//메소드를 선언한다.
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
	





package kr.or.iei.func;
import java.util.Scanner;
public class Example {
	public void exam1() {
		int num1;
		num1 = 20;
		char ch1 = '1';
		long num2 = 10000L;
		float fNum = 3.14f;
		final double PI = 3.14;
		System.out.println("정수출력 : " + (num1 + num1));
		num1 = 200;
		ch1 = '2';
		System.out.println("정수출력 : " + (num1 + num1));
		System.out.println("문자출력 :" + (ch1 + ch1));
		System.out.println(num2);
		System.out.println(fNum);

	}

	public void exam2() {
			String name = "황은영";
			int age;
			age = 32;
			String address = "경기도 고양시 덕양구 화정동";
			char gender = '여';
			System.out.print("이름 : "+name);
			System.out.print("나이: "+age);
			System.out.print("주소: "+address);
			System.out.print("성별: "+gender);
						
			
		}
	
	public void exam3() {
		int num = 2147483647;
		long result = (long)num + 1;
		System.out.println(result);
	}
	public void exam4() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(num1 +"+"+ num2+"="+(num1+num2)+"입니다.");
		System.out.printf("%d+%d=\t%d입니다.\n\n",num1,num2,num3);
		double d =1.123454688431;
		System.out.println(d);
		System.out.printf("%.2f",d);
	
	//	System.out.println("정수형 변수 num안에 들어있는 값은 "+num+"입니다.");
	
	//	System.out.printf("정수형 변수 num안에 들어있는 값은 %d입니다.",num);
	}
	public void exam5() {
		int num = 100;
		long num1 = 999900000000L;
		float fNum = 486.520f;
		double d = 5697.890123;
		char ch = 'A';
		String str = "Hello JAVA";
		boolean bool = true;
		
		System.out.println(num);
		System.out.println();
		System.out.println(fNum);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);
	}
	public void exam6() {
		String name = "황은영";
		String name1 = "변유라";
	    int age = 32;
	    int age1 = 28;
		char gender = '여';
		char gender1 = '여';
		String address = "경기도 고양시 덕양구 화정동";
		String address1 = "경기도 고양시 일산서구";
		String cell = "01087964211";
		String cell1 = "01071417433";
		String mail = "marba0418@gmail.com";  
		String mail1 = "hanmail.you@gmail.com";
		
		System.out.println("이름\t나이\t성별\t지역\t전화번호\t이메일");
	}
	public void scan() {
		Scanner sc = new Scanner(System.in);
		//정수형 입력받는 방법
		System.out.print("정수입력 : ");//정수입력 출력한다.
		int inputNumber;//정수형 변수를 선언한다.
		
		inputNumber = sc.nextInt();//
		System.out.println("사용자가 입력한 값 : "+inputNumber);
		//실수형 입력받는 방법
		System.out.println("실수 입력 : ");
		double dNum = sc.nextDouble();
		System.out.println("사용자가 입력한 실수 값 : "+dNum);
		//문자열 입력받는 방법
		System.out.print("첫번째 문자열 입력 : ");
		String str1 = sc.next();
		System.out.println("str1 : "+str1);
		sc.nextLine();
		System.out.print("두번째 문자열 입력 : ");
		String str2 = sc.nextLine();
		System.out.println("str2 : "+str2.charAt(1));
		//문자입력 받는 방법
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println("입력한 문자는 : "+ch);
	
		
	}
	public void scan1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		sc.nextLine();//엔터처리용
		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 입력 : ");
		double weight = sc.nextDouble();
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		System.out.printf("%s,%d,%s,%d,%.1f,%c",name,age,addr,(int)height,weight,gender);
		
	}
	public void scan2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int point = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int point2 = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int point3 =sc.nextInt();
		int point4 =point + point2 + point3;
		System.out.println("당신 성적의 총 합은 point4 이고 평균은 point4/(double)3 입니다.");
		
	}
	
	

}

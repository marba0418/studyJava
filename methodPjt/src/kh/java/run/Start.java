package kh.java.run;
import kh.java.func.MethodTest;
import java.util.Scanner;
import kh.java.func.Exam;
public class Start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest mt = new MethodTest();
		mt.sum(10, 20);
		mt.sum(10, 20,30);
////		Exam e = new Exam();
//		int[]arr= {1,2,3,4,5};
//		int[]arr1 =arr;//얕은 복사
//		System.out.println(arr[2]);
		//arr [2]내부의 값을 복사해서 전달
//		e.testFunction(arr[2]);
//		System.out.println(arr[2]);//왜 3이 나올까? 
//		
//		//arr 배열의 주소를 전달 (콜바이레퍼런스)//불러오는거
//		e.testFunction2(arr);
//		System.out.println(arr[2]);
////		System.out.print("영문자 입력 : ");
////		char ch = sc.next().charAt(0);
//		System.out.println("==== 변환 ====");
//		char ch2 = e.changeChar(ch);
//		//메소드 이름은 changeChar
		//리턴타입 char
		//매개변수 :1개 데이터 타입은 char
		
		//System.out.println(ch+"-->"+ch2);
		//a-->A
		
		//MethodTest test = new MethodTest();
		//test.main();
		//아래처럼 기능을 가져다 쓸 수 있다.(다른 클래스에서 가져다가 스캐너나 랜덤도 마찬가지였음)
		//int result = test.sum(10, 20);
		//System.out.println(result);

	}

}

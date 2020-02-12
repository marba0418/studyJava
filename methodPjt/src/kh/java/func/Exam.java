package kh.java.func;

public class Exam {
	public char changeChar(char ch) {
		return (char) (ch ^ 32);// char에서 문자를 숫자로 바꿔줌
	}

	public void testFunction(int num) {
		num =100;//순수값이 넘어감(일반 기본 자료형)

	}
	public void testFunction2(int[]arr1) {//정수형 배열을 받아보자
		arr1[2]=100;
		//주소값이 넘어감(얕은복사와 비슷...) 주소값을 바꾸면 값이 바꿔짐 
	}
}

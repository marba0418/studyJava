package kh.java.func;

public class Exam {
	public char changeChar(char ch) {
		return (char) (ch ^ 32);// char���� ���ڸ� ���ڷ� �ٲ���
	}

	public void testFunction(int num) {
		num =100;//�������� �Ѿ(�Ϲ� �⺻ �ڷ���)

	}
	public void testFunction2(int[]arr1) {//������ �迭�� �޾ƺ���
		arr1[2]=100;
		//�ּҰ��� �Ѿ(��������� ���...) �ּҰ��� �ٲٸ� ���� �ٲ��� 
	}
}

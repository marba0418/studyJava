package kh.java.run;
import kh.java.test.Animal;
import kh.java.test.Tiger;
public class Start {

	public static void main(String[] args) {
		Animal a = new Animal();
		//�ִϸ� ��ü ����
		a.crying();
		Tiger t = new Tiger();
		t.crying();
		t.hunting();
		
		Animal at = new Tiger();//�ڽ�(Ÿ�̰�)�� �θ�Ÿ������ ����ȯ �Ǿ��ִ�.
		at.crying();//�θ�Ÿ�Ը� �� �� �ִ�.
		((Tiger)at).hunting();//at�� Ÿ�̰� Ÿ������ �ٲٰ� �װ� �������� �޴´�.(�ٿ� ĳ����)
		// TODO Auto-generated method stub

	}

}

package kh.java.run;
import kh.java.test.Animal;
import kh.java.test.Tiger;
public class Start {

	public static void main(String[] args) {
		Animal a = new Animal();
		//애니멀 개체 만듬
		a.crying();
		Tiger t = new Tiger();
		t.crying();
		t.hunting();
		
		Animal at = new Tiger();//자식(타이거)이 부모타임으로 형변환 되어있다.
		at.crying();//부모타입만 쓸 수 있다.
		((Tiger)at).hunting();//at를 타이거 타입으로 바꾸고 그걸 헌팅으로 받는다.(다운 캐스팅)
		// TODO Auto-generated method stub

	}

}

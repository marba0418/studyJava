package kr.or.iei.point;

public class Gold extends Grade {
	// grade 변수 ,name변수,point변수
	// getter,setter 상속 완료
	public Gold() {
		super();//골드가 실버의 생성자를 부르는 거.. 써도 되고 안써도 됨 

	}

	public Gold(String grade, String name, int point) {
		super(grade, name, point);
		

	}
	@Override//오버라이딩 : 부모꺼 자식에 맞게 고쳐씀 
	public double getDpoint() {
		return 0.05*getPoint();
	}

}

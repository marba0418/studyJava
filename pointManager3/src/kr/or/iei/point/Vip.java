package kr.or.iei.point;

public class Vip extends Grade{
	//생성자
	public Vip() {
		
	}
	//매개변수 있는 생성자
	public Vip(String grade, String name,int point) {
		super(grade,name,point);
	}
	@Override
	public double getDpoint() {
		return 0.07*getPoint();
	}

}

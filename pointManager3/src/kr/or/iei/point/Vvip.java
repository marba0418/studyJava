package kr.or.iei.point;

public class Vvip extends Grade {
	public Vvip() {
		
	}
	public Vvip(String grade, String name,int point) {
		super(grade,name,point);
	}
//	@Override//������Ű�� ��� ?
	public double getDpoint() {
		return 0.1*getPoint();
		
	}
	

}

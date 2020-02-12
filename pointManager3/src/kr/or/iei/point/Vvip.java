package kr.or.iei.point;

public class Vvip extends Grade {
	public Vvip() {
		
	}
	public Vvip(String grade, String name,int point) {
		super(grade,name,point);
	}
//	@Override//고정시키는 방법 ?
	public double getDpoint() {
		return 0.1*getPoint();
		
	}
	

}

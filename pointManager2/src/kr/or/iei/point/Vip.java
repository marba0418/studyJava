package kr.or.iei.point;

public class Vip extends Silver{
	//������
	public Vip() {
		
	}
	//�Ű����� �ִ� ������
	public Vip(String grade, String name,int point) {
		super(grade,name,point);
	}
	@Override
	public double getDpoint() {
		return 0.07*getPoint();
	}

}

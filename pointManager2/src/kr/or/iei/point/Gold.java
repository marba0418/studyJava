package kr.or.iei.point;

public class Gold extends Silver {
	// grade ���� ,name����,point����
	// getter,setter ��� �Ϸ�
	public Gold() {
		super();//��尡 �ǹ��� �����ڸ� �θ��� ��.. �ᵵ �ǰ� �Ƚᵵ �� 

	}

	public Gold(String grade, String name, int point) {
		super(grade, name, point);
		System.out.println("test");

	}
	@Override//�������̵� : �θ� �ڽĿ� �°� ���ľ� 
	public double getDpoint() {
		return 0.05*getPoint();
	}

}

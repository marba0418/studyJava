package stairs.func;

public class StairsUp {
	public boolean meal =false;
	public int stairs = 1;
	
	
	public boolean meal() {
		System.out.println("���� ������?");
		meal =!meal;
		return meal;
	}
	public void stairsUp() {
		System.out.println("��� �ö�");
		stairs++;
	}
	public void stairsDown() {
		System.out.println("��� ������");
		stairs--;
	}

}

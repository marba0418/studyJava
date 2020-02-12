package stairs.func;

public class StairsUp {
	public boolean meal =false;
	public int stairs = 1;
	
	
	public boolean meal() {
		System.out.println("밥을 먹을까?");
		meal =!meal;
		return meal;
	}
	public void stairsUp() {
		System.out.println("계단 올라감");
		stairs++;
	}
	public void stairsDown() {
		System.out.println("계단 내려감");
		stairs--;
	}

}

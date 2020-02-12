package kh.java.vo;

public class Snack extends Goods{
	private int kcal;
	private int weight;
	
	public Snack() {
		
	}
	public Snack(int price,int stock,String name,boolean adult,int kcal,int weight) {
		super(price,stock,name,adult);
		this.kcal=kcal;
		this.weight=weight;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal=kcal;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	

}

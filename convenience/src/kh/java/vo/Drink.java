package kh.java.vo;

public class Drink extends Goods{
	private int amount;
	private int kcal;
	
	public Drink() {
		
	}
	public Drink(int price,int stock,String name,boolean adult,int amount,int kcal) {
		super(price,stock,name,adult);
		this.amount = amount;
		this.kcal = kcal;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal =kcal;
	}
	
}

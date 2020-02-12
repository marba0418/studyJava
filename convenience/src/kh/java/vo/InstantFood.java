package kh.java.vo;

public class InstantFood extends Goods{
	private String expired;
	private int kcal;
	
	public InstantFood() {
		
	}
	public InstantFood(int price,int stock,String name,boolean adult,String expired,int kcal) {
		super(price,stock,name,adult);
		this.expired = expired;
		this.kcal = kcal;
		
	}
	public String getExpired() {
		return expired;
	}
	public void setExpired(String expired) {
		this.expired=expired;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal=kcal;
	}

}

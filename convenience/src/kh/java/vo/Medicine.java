package kh.java.vo;

public class Medicine extends Goods{
	private String expired;
	
	public Medicine() {
	}
	public Medicine(int price,int stock,String name,boolean adult,String expired) {
		super(price,stock,name,adult);
		this.expired = expired;
		
		
	}
	public String getExpired() {
		return expired;
	}
	public void setExpired(String expired) {
		this.expired=expired;
	}
	

}

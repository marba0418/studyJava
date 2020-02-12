package kh.java.vo;

public class Goods {
	//가격, 재고,상품 이름 ,성인인증 필요 유무
	private int price;
	private int stock;
	private String name;
	private boolean adult;
	//기본생성사, 매개변수생성자,getter,setter
	public Goods() {
		
	}
	public Goods(int price,int stock,String name,boolean adult) {
		this.price= price;
		this.stock = stock;
		this.name = name;
		this.adult = adult;
	}
	public int getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public String getName() {
		return name;
	}
	public boolean getAdult() {
		return adult;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	
}


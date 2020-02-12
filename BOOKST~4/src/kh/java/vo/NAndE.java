package kh.java.vo;

public class NAndE extends Books{
	
	private String genre;
	public NAndE() {
		
	}
	public NAndE(String name,String writer,String genre, int price, int stock) {
		super(name, writer, genre, price, stock);
	}
	
}

package kh.java.vo;

public class Books {
	
	private String name;
	private String writer;
	private String genre;
	private int price;
	private int stock;
	
	public Books() {}
	
	public Books(String name, String writer, String genre, int price, int stock) {
		this.name=name;
		this.writer=writer;
		this.genre=genre;
		this.price=price;
		this.stock=stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}

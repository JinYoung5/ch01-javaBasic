package kr.s19.object.array;

public class Book {
	private String category;
	private String name;
	private int price;
	private double discount;
	
	public Book() {}
	
	public Book(String category, String name, int price, double discount) {
		this.category	= category;
		this.name		= name;
		this.price	 	= price;
		this.discount	= discount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	} //private 영역 만들고 빈공간 우크릭 source 클릭 generate getters and setters 클릭 select all
	
}

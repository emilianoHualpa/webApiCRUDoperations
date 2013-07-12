package model;

public class Product {
	
	protected int id;
	protected String name;
	protected String category;
	protected double price;
	
	public Product (int id, String name, String category, double price) {
		
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		
	}
	
	public int id(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}

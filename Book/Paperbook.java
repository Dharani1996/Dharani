package org.book;
public class Paperbook extends Book {
	private double shippingWeight;
	private int inStock;
	public Paperbook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Paperbook(Integer id, String title, String author, double price, long iSBNnumber, String publisher,
			String edision) {
		super(id, title, author, price, iSBNnumber, publisher, edision);
		// TODO Auto-generated constructor stub
	}

	public double getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public int getInStock() {
		return inStock;
	}
	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
}
	
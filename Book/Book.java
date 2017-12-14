package org.book;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Author_details",discriminatorType=DiscriminatorType.STRING)
public class Book {
	@OneToMany
	@JoinTable(name="Author_Details",joinColumns=@JoinColumn(name="id"),inverseJoinColumns=@JoinColumn(name="author_id"))  
	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private String author;
	private double price;
	private long ISBNnumber;
	private String publisher;
	private String edision;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer id, String title, String author, double price, long iSBNnumber, String publisher,
			String edision) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		ISBNnumber = iSBNnumber;
		this.publisher = publisher;
		this.edision = edision;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getISBNnumber() {
		return ISBNnumber;
	}
	public void setISBNnumber(long iSBNnumber) {
		ISBNnumber = iSBNnumber;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getEdision() {
		return edision;
	}
	public void setEdision(String edision) {
		this.edision = edision;
	}
	
}
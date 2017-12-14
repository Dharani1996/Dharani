package org.book1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Author {
@OneToOne
@JoinColumn(name="title")
//@ManyToOne
//@ManyToMany
/*private Set<Book> b = new HashSet<Book>();

public Set<Book> getB() {
	return b;
}
public void setB(Set<Book> b) {
	this.b = b;
}*/
private Book b;

public Book getB() {
	return b;
}
public void setB(Book b) {
	this.b = b;
}
@Id
private int id;
private String name;
private String emailid;
private String gender;
private String URL;
public Author() {
	super();
	// TODO Auto-generated constructor stub
}
public Author(int id, String name, String emailid, String gender, String uRL) {
	super();
	this.id = id;
	this.name = name;
	this.emailid = emailid;
	this.gender = gender;
	URL = uRL;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getURL() {
	return URL;
}
public void setURL(String uRL) {
	URL = uRL;
}


}
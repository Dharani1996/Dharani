package org.userinfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue
private int id;
private String name;
private String emailId;
private int phNo;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String name, String emailId, int phNo) {
	super();
	this.id = id;
	this.name = name;
	this.emailId = emailId;
	this.phNo = phNo;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the emailId
 */
public String getEmailId() {
	return emailId;
}
/**
 * @return the phNo
 */
public int getPhNo() {
	return phNo;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @param emailId the emailId to set
 */
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
/**
 * @param phNo the phNo to set
 */
public void setPhNo(int phNo) {
	this.phNo = phNo;
}

}

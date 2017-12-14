package org.collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_crediential")
public class UserCrediential {
	public UserCrediential() {
		super();
	}
	
	@OneToOne
	@JoinColumn(name="profile_id")
	private Userprofile profile;
	
	public Userprofile getProfile() {
		return profile;
	}
	public void setProfile(Userprofile profile) {
		this.profile = profile;
	}
	@Id
	@Column(name="user_name")
	private String userName;
	
	private String password;
	
	private int status;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

}

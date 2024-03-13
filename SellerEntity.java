package com.onlinegrocery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SellerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(unique=true)
	private String username;
	private String password;
	private int mobilenumber;
	private String email;
	static final private int usertype = 3;
	

	public SellerEntity() {
		super();
	}

	public SellerEntity(int id, String vegetables, String fruits, String drinks, String biscuits, String icecreams,
			String snacks, int approval, String username, String password, int mobilenumber, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.email = email;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getUsertype() {
		return usertype;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SellerEntity [id=" + id + ", username=" + username + ", password=" + password + ", mobilenumber="
				+ mobilenumber + ", email=" + email + "]";
	}

	 
}
	
	
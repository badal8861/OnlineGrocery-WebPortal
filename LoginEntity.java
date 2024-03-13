package com.onlinegrocery.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
    private String username;
    private String password;
    private int usertype;
    
    
    public LoginEntity(int id, String username,String password,String email,int usertype , long mobilenumber) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}

    public String getPassword() {
		return password;
	}
    
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
    
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}

	public LoginEntity() {
		super();
	}
	
	public void setId(int id) {
		this.id = id;
	}

		
}





	
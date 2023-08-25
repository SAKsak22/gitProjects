package com.kh.javaday0804;

public class Customer {
	
	private String name;
	private String id;
	private String password;
	private String email;
	
	public Customer(String name, String id, String password, String email) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId() {
		this.id = id;
	}
	public void setPassword() {
		this.password = password;
	}
	public void setEmail() {
		this.email = email;
	}
	
	public String toString() {
		String str = 
					this.name + "\t" + this.id + "\t" +
					this.password+ "\t" + this.email;
		return str;
	}
	
	public boolean equals(String id, String password) {
		return (this.id.equals(id) && this.password.equals(password));
	}
	
	public boolean idCheck(String id) {
		return (this.id.equals(id));
	}	
	
	public boolean passwordCheck(String password) {
		return (this.password.equals(password));
	}	
	

}
	

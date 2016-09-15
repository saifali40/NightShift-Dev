package com.example;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.Unique;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class UserData {
// Initialization	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Key;
	
	@Persistent
	String Name;
	
	@Persistent
	String Email;
	
	@Persistent
	String Phone;
	
	@Persistent
	String Password;
// Initialization	
//Setting the Data	
	public void setKey(Key key){
		this.Key = key;
	}
	
	public void setName(String name){
		this.Name = name;
	}
	
	public void setEmail(String email){
		this.Email = email;
	}
	public void setPhone(String phone){
		this.Phone = phone;
	}
	
	public void setPassword(String password){
		this.Password = password;
	}
// Setting the data
	
// Getting the data	
	public Key getKey(){
		return Key;
	}
	
	public String getName(){
		return Name;
	}
	
	public String getEmail(){
		return Email;
	}
	public String getPhone(){
		return Phone;
	}
	
	public String getPassword(){
		return Password;
	}
	
// getting the data	
}

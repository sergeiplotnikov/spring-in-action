package mywebapp.beans;

import javax.validation.constraints.*;

public class User {
	@NotNull
	@Size(min=2, max=30, message="{firstName.size}")
	private String firstName;

	@NotNull
	@Size(min=2, max=30, message="{lastName.size}")
	private String lastName;

	@NotNull
	@Email(message="{email.valid}")
	private String email;

	@NotNull
	@Size(min=5, max=16, message="{username.size}")
	private String username;

	@NotNull
	@Size(min=5, max=25, message="{password.size}")
	private String password;

	public User(){}

	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getEmail(){
		return this.email;
	}
	public String getUsername(){
		return this.username;
	}
	public String getPassword(){
		return this.password;
	}

	public void setFirstName(String fname){
		this.firstName = fname;
	} 
	public void setLastName(String lname){
		this.lastName = lname;
	}
	public void setEmail(String em){
		this.email = em;
	}
	public void setUsername(String uname){
		this.username = uname;
	}
	public void setPassword(String pass){
		this.password = pass;
	}
}

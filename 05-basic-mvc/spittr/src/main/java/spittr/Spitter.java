package spittr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spitter {
	
	private Long id;
	
	public Spitter(){}

	public Spitter(String usrname, String pass, String fname, String lname){
		id = null;
		username = usrname;
		password = pass;
		firstName = fname;
		lastName = lname;
	}

	public Spitter(Long id, String usrname, String pass, String fname, String lname){
		this(usrname,pass,fname,lname);
		this.id = id;
	}

	public String getUsername(){
		return this.username;
	}
	public String getPassword(){
		return this.password;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastname(){
		return this.lastName;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setFirstname(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	@NotNull
	@Size(min=5, max=16)
	private String username;

	@NotNull
	@Size(min=5, max=25)
	private String password;

	@NotNull
	@Size(min=2, max=30)
	private String firstName;

	@NotNull
	@Size(min=2, max=30)
	private String lastName;
	
	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that, "firstName","lastname", "username", "password");
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "firstName", "lastname", "username", "password");
	}
}

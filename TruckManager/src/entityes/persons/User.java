package entityes.persons;

import entityes.Entity;

public class User extends Entity {

	private String firstName;
	private String lastName;
	private String login;
	private String password;
	
	
	public User(int Id, String firstName, String lastName, String login, String password)
	{
		super(Id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

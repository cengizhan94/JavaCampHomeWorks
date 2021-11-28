package Entities.concretes;

public class PersonalUser extends User {
	private String firstName;
	private String lastName;
	public PersonalUser() {
		
	}
	public PersonalUser(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
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
}

package vercauteren.laurens.eurder.domain;


public class User {

	private final String firstName;
	private final String lastName;
	private String email;
	private String address;
	private String phoneNumber;

	public User(String firstName, String lastName, String email, String address, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
}

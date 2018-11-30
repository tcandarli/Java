/*
 * Create a class called VipCustomer
It should have 3 fields name, credit limit, and email address
Create 3 constructors:
1.Constructor empty should call the constructor with 3 parameters with default values.
2.Constructor should pass on the 2 values it receives and add a default value for the 3rd 
3.Constructor should save all fields.

Hint: Create only getters. Setter wont be needed.
 */

public class Assignment21_2 {

	private String name;
	private double creditLimit;
	private String email;
	
	public Assignment21_2() {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public Assignment21_2 (String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public Assignment21_2 (String name, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
	

}

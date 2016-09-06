package Code;


/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:27:01 AM
 * Abstract class about information Person
 */
public abstract class Person {

	public String email;
	public String name;
	public String phone;

	public Person(){

	}

	public Person(String email, String name, String phone) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
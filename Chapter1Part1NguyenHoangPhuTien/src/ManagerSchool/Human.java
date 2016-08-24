package ManagerSchool;


/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 21/8/2016.
 * Version : 1.
 * Class about information of Human.
 */

public class Human {

	String name;
	String birth;
	String address;
	String phone;
	
	public Human() {
		super();
	}

	public Human(String name, String birth, String address, String phone) {
		super();
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/*
	 * Get full information of Human.
	 * Return result as string type.
	 */
	@Override
	public String toString() {
		return "Human name : " + name + ", birth : " + birth + ", address : " + address + ", phone : " + phone;
	}
	
	
}

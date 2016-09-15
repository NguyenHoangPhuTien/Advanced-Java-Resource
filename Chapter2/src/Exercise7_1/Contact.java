package Exercise7_1;

/*
 * Nguyen Hoang Phu Tien
 * Verson: 1.0
 * Date : 15/9/2016
 * Class about contact information
 */
public class Contact {

	String name;
	String phone;
	
	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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
	
	/*
	 * Display information of contact
	 * Return result as a String type
	 */
	public String displayInformation(){
		return "Name: " + name + "\tphone: " + phone; 
	}

	@Override
	public boolean equals(Object arg0) {
		Contact c = (Contact) arg0;
		if(c.getName().equals(this.name) && c.getPhone().equals(phone))
			return true;
		return false;
	}
	
	
}

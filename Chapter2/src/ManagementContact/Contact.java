package ManagementContact;

/*
 * Nguyen Hoang Phu Tien
 * Version : 1.0
 * Date : 7/9/2016
 * Class about information contact
 */

public class Contact {

	String numberPhone;
	String name;
	
	public Contact() {
		super();
	}

	public Contact(String numberPhone, String name) {
		super();
		this.numberPhone = numberPhone;
		this.name = name;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * Display information of contact
	 */
	public void displayInformation(){
		
		System.out.println(name + " " + numberPhone);
	}

	/*
	 * Compare two contact
	 * param : contact
	 */
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		Contact con = (Contact)obj;
		if(this.name.equals(con.name) && this.numberPhone.equals(con.numberPhone))
			result = true;
		return result;
	}
	
	
}

package Code;


/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:27:01 AM
 * Class about information Student
 * This class extend by Person
 */
public class Student extends Person {

	private String birthDay;

	public Student(){

	}

	public Student(String email, String name, String phone, String birthDay) {
		super(email, name, phone);
		this.birthDay = birthDay;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	/*
	 * Get information of student
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		
		return "Name of student: " + name + " - email: " + email + " - phone: " + phone
				+ " - birthday: " + birthDay;
	}

}
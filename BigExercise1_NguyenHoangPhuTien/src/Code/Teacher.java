package Code;
import java.util.List;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:27:02 AM
 * Class about information Teacher
 * This class extend by Person
 */
public class Teacher extends Person {

	private List<String> listSubject;

	public Teacher(){

	}

	public Teacher(String email, String name, String phone, List<String> listSubject) {
		super(email, name, phone);
		this.listSubject = listSubject;
	}

	public List<String> getListSubject() {
		return listSubject;
	}

	public void setListSubject(List<String> listSubject) {
		this.listSubject = listSubject;
	}

	/**
	 * Add new subject into list of subject of Teacher
	 * @param name of subject
	 * Return result as a list of String
	 */
	public List<String> addSubject(String subject){
		return null;
	}

	/*
	 * Get information of teacher
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		
		String result = "Name of teacher: " + name + " - email: " + email + " - phone: " + phone + " ";
		for(String subject : listSubject)
			result += subject + " ";
		return result;
	}
}
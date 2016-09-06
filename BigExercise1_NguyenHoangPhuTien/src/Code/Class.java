package Code;
import java.util.List;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:32:05 AM
 * Class about information of CLass
 */
public class Class {

	private String endDate;
	private String nameOfClass;
	private String numOfContract;
	private int numOfLesson;
	private String startDate;
	public List<Subject> listSubject;
	public List<Student> listStudent;
	public Teacher m_Teacher;
	public MarkTable m_MarkTable;

	public Class(){

	}

	public Class(String endDate, String nameOfClass, String numOfContract, String startDate, List<Subject> listSubject,
			List<Student> listStudent, Teacher m_Teacher, MarkTable m_MarkTable) {
		super();
		this.endDate = endDate;
		this.nameOfClass = nameOfClass;
		this.numOfContract = numOfContract;
		this.startDate = startDate;
		this.listSubject = listSubject;
		this.listStudent = listStudent;
		this.m_Teacher = m_Teacher;
		this.m_MarkTable = m_MarkTable;
	}
	
	public Class(String endDate, String nameOfClass, String numOfContract, int numOfLesson, String startDate,
			List<Subject> listSubject, List<Student> listStudent, Teacher m_Teacher) {
		super();
		this.endDate = endDate;
		this.nameOfClass = nameOfClass;
		this.numOfContract = numOfContract;
		this.numOfLesson = numOfLesson;
		this.startDate = startDate;
		this.listSubject = listSubject;
		this.listStudent = listStudent;
		this.m_Teacher = m_Teacher;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getNameOfClass() {
		return nameOfClass;
	}

	public void setNameOfClass(String nameOfClass) {
		this.nameOfClass = nameOfClass;
	}

	public String getNumOfContract() {
		return numOfContract;
	}

	public void setNumOfContract(String numOfContract) {
		this.numOfContract = numOfContract;
	}

	public int getNumOfLesson() {
		return numOfLesson;
	}

	public void setNumOfLesson(int numOfLesson) {
		this.numOfLesson = numOfLesson;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public List<Subject> getListSubject() {
		return listSubject;
	}

	public void setListSubject(List<Subject> listSubject) {
		this.listSubject = listSubject;
	}

	public List<Student> getM_Student() {
		return listStudent;
	}

	public void setM_Student(List<Student> listStudent) {
		this.listStudent = listStudent;
	}

	public Teacher getM_Teacher() {
		return m_Teacher;
	}

	public void setM_Teacher(Teacher m_Teacher) {
		this.m_Teacher = m_Teacher;
	}

	public MarkTable getM_MarkTable() {
		return m_MarkTable;
	}

	public void setM_MarkTable(MarkTable m_MarkTable) {
		this.m_MarkTable = m_MarkTable;
	}

	/*
	 * Get information of class
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		return "Class name: " + nameOfClass + " - start date: " + startDate + " - end date: " + endDate
				+ " - name of teacher: " + m_Teacher.name + " - total of lesson: " + numOfLesson 
				+ " - num of contract: " + numOfContract;
	}

	/*
	 * Get information of students in class
	 * Return result as a String type
	 */
	public String printInformationStudent(){
		
		String information = "";
		for(Student student : listStudent){
			information += "Name: " + student.name + " - phone: " + student.phone + " - email: " + student.email + " - birthday: " + student.getBirthDay() + "\n";
		}
		return information;
	}
	
	/*
	 * Get information of subject 
	 * Return result as a String type
	 */
	public String printInformationSubject(){
		String information = "";
		for(Subject subject : listSubject)
			information += "Subject name: " + subject.getNameOfSubject() + " - total of lesson: " 
			+ subject.getNumOfLesson() + " - start date: " + subject.getStartDate()
			+ " - end date: " + " - name of teacher: " + subject.getM_Teacher().name + "\n";
		return information;
	}
	
	public void addStudent(Student student){
		listStudent.add(student);
	}
}
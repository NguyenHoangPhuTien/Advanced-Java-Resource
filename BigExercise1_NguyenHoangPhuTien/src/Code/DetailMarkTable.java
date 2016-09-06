package Code;


/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:27:07 AM
 * Class about information detail mark table
 */
public class DetailMarkTable {

	public Subject m_Subject;
	public Student m_Student;
	public FinalGrade m_FinalGrade;

	public DetailMarkTable(){

	}

	public DetailMarkTable(Subject m_Subject, Student m_Student, FinalGrade m_FinalGrade) {
		super();
		this.m_Subject = m_Subject;
		this.m_Student = m_Student;
		this.m_FinalGrade = m_FinalGrade;
	}

	public Subject getM_Subject() {
		return m_Subject;
	}

	public void setM_Subject(Subject m_Subject) {
		this.m_Subject = m_Subject;
	}

	public Student getM_Student() {
		return m_Student;
	}

	public void setM_Student(Student m_Student) {
		this.m_Student = m_Student;
	}

	public FinalGrade getM_FinalGrade() {
		return m_FinalGrade;
	}

	public void setM_FinalGrade(FinalGrade m_FinalGrade) {
		this.m_FinalGrade = m_FinalGrade;
	}

}
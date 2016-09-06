package Code;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:26:59 AM
 * Class about information of Subject
 */
public class Subject {

	private String endDate;
	private String nameOfSubject;
	private int numOfLesson;
	private String startDate;
	public Teacher m_Teacher;

	public Subject(){

	}

	public Subject(String endDate, String nameOfSubject, int numOfLesson, String startDate,
			Teacher m_Teacher) {
		super();
		this.endDate = endDate;
		this.nameOfSubject = nameOfSubject;
		this.numOfLesson = numOfLesson;
		this.startDate = startDate;
		this.m_Teacher = m_Teacher;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getNameOfSubject() {
		return nameOfSubject;
	}

	public void setNameOfSubject(String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
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

	public Teacher getM_Teacher() {
		return m_Teacher;
	}

	public void setM_Teacher(Teacher m_Teacher) {
		this.m_Teacher = m_Teacher;
	}

	@Override
	public String toString() {
		return "Name of subject: " + nameOfSubject + " - start date: " + startDate + " - end date: " + endDate
				+ " - number of lesson: " + numOfLesson + "\n" + m_Teacher.toString();
				
	}

	
}
package Code;
import java.util.List;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:27:06 AM
 * Class for final grade of student
 */
public class FinalGrade {

	public List<MarkSession> list;
	public MarkExam m_MarkExam;

	public FinalGrade(){

	}

	public FinalGrade(List<MarkSession> list, MarkExam m_MarkExam) {
		super();
		this.list = list;
		this.m_MarkExam = m_MarkExam;
	}

	public List<MarkSession> getList() {
		return list;
	}

	public void setList(List<MarkSession> list) {
		this.list = list;
	}

	public MarkExam getM_MarkExam() {
		return m_MarkExam;
	}

	public void setM_MarkExam(MarkExam m_MarkExam) {
		this.m_MarkExam = m_MarkExam;
	}

	/*
	 * Calculate average of all session mark
	 * Return result as a double type
	 */
	public double calAllSessionMark(){
		double result = 0;
		for(MarkSession mark: list)
			result += mark.calSessionGrade();
		return result = result / list.size();
	}

	/*
	 * Calculate total final grade 
	 * Return result as a double type
	 */
	public double calFinalGrade(){
		return calAllSessionMark() * 0.3 + m_MarkExam.getMarkMultiChoice()
		* 0.4 + m_MarkExam.getMarkPractice() * 0.3;
	}

}
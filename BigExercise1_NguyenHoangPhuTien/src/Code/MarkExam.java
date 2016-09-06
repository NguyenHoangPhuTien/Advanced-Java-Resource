package Code;


/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:27:06 AM
 * Class about information exam of student
 */
public class MarkExam {

	private double markMultiChoice;
	private double markPractice;

	public MarkExam(){

	}

	public MarkExam(double markMultiChoice, double markPractice) {
		super();
		this.markMultiChoice = markMultiChoice;
		this.markPractice = markPractice;
	}

	public double getMarkMultiChoice() {
		return markMultiChoice;
	}

	public void setMarkMultiChoice(double markMultiChoice) {
		this.markMultiChoice = markMultiChoice;
	}

	public double getMarkPractice() {
		return markPractice;
	}

	public void setMarkPractice(double markPractice) {
		this.markPractice = markPractice;
	}
	
}
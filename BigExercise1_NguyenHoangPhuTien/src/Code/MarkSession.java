package Code;


/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:27:05 AM
 * Class about information for each session
 */
public class MarkSession {

	private double markAttendence;
	private double markActive;
	private double markExercise;

	public MarkSession(){

	}

	public MarkSession(double markAttendence, double markActive, double markExercise) {
		super();
		this.markAttendence = markAttendence;
		this.markActive = markActive;
		this.markExercise = markExercise;
	}

	public double getMarkAttendence() {
		return markAttendence;
	}

	public void setMarkAttendence(double markAttendence) {
		this.markAttendence = markAttendence;
	}

	public double getMarkActive() {
		return markActive;
	}

	public void setMarkActive(double markActive) {
		this.markActive = markActive;
	}

	public double getMarkExercise() {
		return markExercise;
	}

	public void setMarkExercise(double markExercise) {
		this.markExercise = markExercise;
	}

	/**
	 * Update mark of attendance
	 * @param status
	 * Return result as a double type
	 */
	public void update(String status){
		status = status.toLowerCase();
		
		if(status.equals("late"))
			setMarkAttendence(5);
		else if(status.equals("appear"))
			setMarkAttendence(10);
		else if(status.equals("disappear"))
			setMarkAttendence(0);
		else
			setMarkAttendence(5);
	}
	
	/*
	 * Calculate session grade 
	 * Return result as a double type
	 */
	public double calSessionGrade(){
		return getMarkAttendence() * 0.3 + getMarkActive() * 0.1 + getMarkExercise() * 0.6;
	}

}
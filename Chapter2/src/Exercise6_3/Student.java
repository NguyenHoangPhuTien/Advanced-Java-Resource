package Exercise6_3;

import java.text.DecimalFormat;

/*
 * Nguyen Hoang Phu Tien
 * Version 1.0
 * Date: 14/09/2016
 * Class for information of student
 */
public class Student {

	String name;
	int grade;
	double semaster1;
	double semaster2;
	
	public Student() {
		super();
	}

	public Student(String name, int grade, double semaster1, double semaster2) {
		super();
		this.name = name;
		this.grade = grade;
		this.semaster1 = semaster1;
		this.semaster2 = semaster2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getSemaster1() {
		return semaster1;
	}

	public void setSemaster1(double semaster1) {
		this.semaster1 = semaster1;
	}

	public double getSemaster2() {
		return semaster2;
	}

	public void setSemaster2(double semaster2) {
		this.semaster2 = semaster2;
	}
	
	/*
	 * Cal avarage for 2 semaster of student
	 * Return result as a string type
	 */
	public String calAvarage(){
		double avg = 0;
		avg = (semaster1 + semaster2 *2) / 3;
		DecimalFormat df = new DecimalFormat("###.##");
		String result = df.format(avg);
		return result;
		
	}
	
	/*
	 * evaluation of result avarage of student
	 * Return result as a String type
	 */
	public String evalResult(){
		String result = "";
		double avg = Double.parseDouble(calAvarage());
		if(avg < 5)
			result = "bad";
		else if(avg < 7)
			result = "medium";
		else if(avg < 8)
			result = "rather";
		else
			result = "exellent";
		return result;
	}
	
	public String displayInformation(){
		
		return "Name of student: " + name + "\t grade: " + grade + "\t semaster1: " + semaster1
				+ "\t semaster2: " + semaster2 + "\t avarage: " + calAvarage()
				+ "\t evaluation: " + evalResult();
	}
}

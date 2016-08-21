package ManagerSchool;

public class Student extends Human implements iClass{

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 21/8/2016.
	 * Version : 1.
	 * Class about information of Student.
	 * This class extend by Human class.
	 */
	
	String nameClass;
	double pointSemester_1;
	double pointSemester_2;
	
	public Student() {
		super();
	}

	public Student(String name, String birth, String address, String phone, String nameClass, double pointSemester_1,
			double pointSemester_2) {
		super(name, birth, address, phone);
		this.nameClass = nameClass;
		this.pointSemester_1 = pointSemester_1;
		this.pointSemester_2 = pointSemester_2;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public double getPointSemester_1() {
		return pointSemester_1;
	}

	public void setPointSemester_1(double pointSemester_1) {
		this.pointSemester_1 = pointSemester_1;
	}

	public double getPointSemester_2() {
		return pointSemester_2;
	}

	public void setPointSemester_2(double pointSemester_2) {
		this.pointSemester_2 = pointSemester_2;
	}

	@Override
	public String toString() {
		return "Student nameClass : " + nameClass + ", pointSemester_1 : " + pointSemester_1 + ", pointSemester_2 : "
				+ pointSemester_2 + ", name : " + name + ", birth : " + birth + ", address : " + address + ", phone : " + phone;
	}
	
	
}

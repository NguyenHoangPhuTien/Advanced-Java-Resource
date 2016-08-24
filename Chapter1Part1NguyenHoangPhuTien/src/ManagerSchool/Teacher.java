package ManagerSchool;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 21/8/2016.
 * Version : 1.
 * Class about information of Teacher.
 * This class extend by Human class.
 */

public class Teacher extends Human{

	double coefSalary;
	double bonusSalary;
	String leaderClass;
	
	public Teacher() {
		super();
	}

	public Teacher(String name, String birth, String address, String phone, double coefSalary, double bonusSalary,
			String leaderClass) {
		super(name, birth, address, phone);
		this.coefSalary = coefSalary;
		this.bonusSalary = bonusSalary;
		this.leaderClass = leaderClass;
	}

	public double getCoefSalary() {
		return coefSalary;
	}

	public void setCoefSalary(double coefSalary) {
		this.coefSalary = coefSalary;
	}

	public double getBonusSalary() {
		return bonusSalary;
	}

	public void setBonusSalary(double bonusSalary) {
		this.bonusSalary = bonusSalary;
	}

	public String getLeaderClass() {
		return leaderClass;
	}

	public void setLeaderClass(String leaderClass) {
		this.leaderClass = leaderClass;
	}

	/*
	 * Get full information of Teacher.
	 * Return result as string type.
	 */
	@Override
	public String toString() {
		return "Teacher coefSalary : " + coefSalary + ", bonusSalary : " + bonusSalary + ", leaderClass : " + leaderClass
				+ ", name : " + name + ", birth : " + birth + ", address : " + address + ", phone : " + phone;
	}
	
	
}

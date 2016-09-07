package ManagementEmployee;

/*
 * Nguyen Hoang Phu Tien
 * Version : 1.0
 * Date : 7/9/2016
 * Class about information Employee
 */

public class Employee {

	String name;
	int age;
	double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/*
	 * Display information of employee
	 */
	public void displayEmployee(){
		System.out.println("Name of employee: " + name + " age: " + age + " salary: " + salary);
	}
}

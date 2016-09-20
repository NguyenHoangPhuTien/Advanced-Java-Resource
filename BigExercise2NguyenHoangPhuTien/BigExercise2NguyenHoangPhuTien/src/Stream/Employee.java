package Stream;

/*
 * Nguyen Hoang Phu Tien
 * version: 1.0
 * Class about information of Employee
 * date: 19/9/2016
 */
public class Employee {

	String name;
	int age;
	double salary;
	
	public Employee() {
		super();
	}
	public Employee(String name, int age, double price) {
		super();
		this.name = name;
		this.age = age;
		this.salary = price;
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
	 * Display all information off employee
	 * Return result as a String
	 */
	public String displayInformation(){
		
		return "Name of emmployee: " + name + " - age: " + age + " - salary: " + String.format("%.2f", salary);
	}
}

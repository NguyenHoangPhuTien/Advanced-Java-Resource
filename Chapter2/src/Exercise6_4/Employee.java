package Exercise6_4;

import java.io.Serializable;


/*
 * Nguyen Hoang Phu Tien
 * Version 1.0
 * Date: 14/09/2016
 * Class for information of employee
 */
public class Employee implements Serializable{

	String name;
	String id;
	int age;
	
	public Employee() {
		super();
	}

	public Employee(String name, String id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * Display full information of Employee
	 * Return result as a String type
	 */
	public String displayInformation(){
		
		return "Name of employee: " + name +"\t\tid: " + id + "\tage: " + age;
	}
}

/**
 * 
 */
package Exercise4_3;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0
 * Date: 12/9/2016
 * Class about information Student
 */
public class Student {

	int age;
	String name;
	double mark1;
	double mark2;
	
	public Student() {
		super();
	}

	public Student(int age, String name, double mark1, double mark2) {
		super();
		this.age = age;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	
	/*
	 * Find avarge of mark of student
	 * Return result as a double type
	 */
	public double findAvarageMark(){
		
		return (mark1 + mark2) / 2;
	}
	
	/*
	 * Get information of student
	 * Return result as a String type
	 */
	public String displayInformation(){
		
		return "Name of student: " + name + " age: " + age + " mark 1: " + mark1
				+ " mark 2: " + mark2;
	}
}

package ManagementEmployee;

/**
 * 
 * @author Nguyen Hoang Phu Tien
 * date: 8/9/2016
 * @version : 1.0
 * --------------------------
 * create class Employee to manage class
 */
public class Employee {
	private String name;
	private int age;
	private String placeOfBirth;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, String placeOfBirth) {
		super();
		this.name = name;
		this.age = age;
		this.placeOfBirth = placeOfBirth;
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

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	/*
	 * Show full information of employee
	 */
	public void show(){
		System.out.println("---------------------------------");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("place of birth: " + placeOfBirth);
		System.out.println("---------------------------------");
	}
}

package Clone;

public class MainTestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department hr = new Department(1, "aaaa");
		Employee emp = new Employee(2, "bbb", hr);
		
		Employee clone = (Employee) emp.clone();
		clone.getDepartment().setName("ccc");
		
		System.out.println(emp.getDepartment().getName());
		System.out.println(clone.getDepartment().getName());
	}

}

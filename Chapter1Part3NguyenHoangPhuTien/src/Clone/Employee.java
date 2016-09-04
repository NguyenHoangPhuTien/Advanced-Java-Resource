package Clone;

public class Employee extends Human implements Cloneable {

	private Department department;

	public Employee() {
		super();
	}

	public Employee(int id, String name, Department department) {
		super(id, name);
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	// Accessor/mutators methods will go there
}

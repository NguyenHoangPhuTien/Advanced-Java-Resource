package Clone;

public class Employee implements Cloneable{
	 
    private int empoyeeId;
    private String employeeName;
    private Department department;
 
    public Employee(int id, String name, Department dept)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }
    
    
    public int getEmpoyeeId() {
		return empoyeeId;
	}


	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
    protected Object clone() throws CloneNotSupportedException {
        Employee clone = (Employee) super.clone();
        clone.setDepartment((Department)clone.getDepartment().clone());
        return clone;
    }
     
    //Accessor/mutators methods will go there
}

package ManagementEmployee;

import java.util.TreeMap;

/*
 * Nguyen Hoang Phu Tien
 * Version : 1.0
 * Date : 7/9/2016
 * Class for manage Employee
 */
public class ManageEmployee {

	TreeMap<Double, Employee> tree;

	public ManageEmployee(TreeMap<Double, Employee> tree) {
		super();
		this.tree = tree;
	}

	public ManageEmployee() {
		super();
	}

	public TreeMap<Double, Employee> getTree() {
		return tree;
	}

	public void setTree(TreeMap<Double, Employee> tree) {
		this.tree = tree;
	}
	
	/*
	 * Add new employee
	 * param : employee
	 */
	public void addNewEmployee(Employee emp){
		
		tree.put(emp.salary, emp);
	}
	
	/*
	 * Remove employee by salary
	 * param: salary
	 */
	public void removeEmployee(double salary){
		
		tree.remove(salary);
	}
	
	/*
	 * Search employee by salary
	 * param: salary
	 */
	public Employee search(double salary){
		
		return tree.get(salary);
	}
	
	/*
	 * Display information of all employee
	 */
	public void displayAllEmployee(){
		
		for(Object salary : tree.keySet()){
			Employee emp = tree.get(salary);
			emp.displayEmployee();
		}
	}
}

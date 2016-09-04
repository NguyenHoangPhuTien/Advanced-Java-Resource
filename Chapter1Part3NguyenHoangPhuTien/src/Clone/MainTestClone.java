package Clone;

public class MainTestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cache.loadCache();
		
		Employee emp = (Employee) Cache.getHuman("1");
		Management manage = (Management) Cache.getHuman("2");
		
		System.out.println(emp.getDepartment().getName());
		System.out.println(manage.getDp().getName());
		
		emp.getDepartment().setName("def");
		Employee emp1 = (Employee) Cache.getHuman("1");
		
		System.out.println(emp.getDepartment().getName());
		System.out.println(emp.getDepartment().getName());
		System.out.println(manage.getDp().getName());
	}

}

package Clone;

public class MainTestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cache.loadCache();
		
		Employee emp = (Employee) Cache.getHuman("1");
		Management manage = (Management) Cache.getHuman("2");
		
		System.out.println(emp.getId());
		
		emp.setId(3);
		emp.setName("hau");
		
		Employee emp1 = (Employee) Cache.getHuman("1");
		System.out.println(emp.getName());
		System.out.println(emp1.getName());
	}

}

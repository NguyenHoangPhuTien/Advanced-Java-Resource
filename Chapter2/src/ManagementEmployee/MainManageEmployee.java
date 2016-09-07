package ManagementEmployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.TreeMap;

public class MainManageEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("tien", 18, 25);
		Employee emp2 = new Employee("hau", 18, 18);
		
		TreeMap<Double, Employee> tree = new TreeMap<>();
		tree.put(emp1.salary, emp1);
		tree.put(emp2.salary, emp2);
		
		ManageEmployee manage = new ManageEmployee(tree);
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int cont = 1;
			while(cont == 1){
				System.out.println("1.Add new employee");
				System.out.println("2.Search employee by salary");
				System.out.println("3.View all employee");
				System.out.println("4.Eixt");
				System.out.println("Please choice 1 or 2 or 3 or 4");
				int choice = Integer.parseInt(input.readLine());
				
				switch (choice) {
				
					case 1:
						System.out.println("Input name of employee: ");
						String name = input.readLine();
						System.out.println("Input age of employee: ");
						int age = Integer.parseInt(input.readLine());
						System.out.println("Input salary of employee");
						double salary = Double.parseDouble(input.readLine());
						manage.addNewEmployee(new Employee(name, age, salary));
						break;
						
					case 2:
						System.out.println("Input salary: ");
						double salary1 = Double.parseDouble(input.readLine());
						Employee emp3 = manage.search(salary1);
						if(emp3 == null)
							System.out.println("No have employee");
						else
							emp3.displayEmployee();
						break;
						
					case 3:
						manage.displayAllEmployee();
						break;
						
					default:
						cont = 0;
				}
			}
		} catch (NumberFormatException | IOException |InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}

package Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Nguyen Van A", 18, 800000));
		list.add(new Employee("Nguyen Van B", 20, 18000000));
		list.add(new Employee("Nguyen Van C", 19, 8000000));
		list.add(new Employee("Nguyen Van D", 21, 2000000));
		list.add(new Employee("Nguyen Van E", 22, 2800000));
		list.add(new Employee("Nguyen Van F", 18, 10000000));
		list.add(new Employee("Nguyen Van G", 25, 80000000));
		list.add(new Employee("Nguyen Van H", 18, 15000000));
		list.add(new Employee("Nguyen Van I", 18, 20000000));
		list.add(new Employee("Nguyen Van K", 30, 14000000));
		list.add(new Employee("Nguyen Van L", 18, 800000));
		list.add(new Employee("Nguyen Van M", 18, 300000));
		list.add(new Employee("Nguyen Van N", 18, 200000));
		list.add(new Employee("Nguyen Van Anh", 18, 6000000));
		list.add(new Employee("Nguyen Van Anh", 18, 10800000));
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		DoubleSummaryStatistics statistics2 = list.stream().mapToDouble(e -> e.getSalary()).summaryStatistics();
		
		try {
			int cont = 1;
			while(cont == 1){
				System.out.println("1.View all employee");
				System.out.println("2.Search by price (rather than 3000000)");
				System.out.println("3.Search by name (contains \"Anh\")");
				System.out.println("4.Calculate average age of all employee");
				System.out.println("5.Find max of salary");
				System.out.println("6.Find min of salary ");
				System.out.println("7.Calculate average salary of all employee");
				System.out.println("Please choice option");
				int choice = Integer.parseInt(input.readLine());
				
				switch(choice){
				
					//View all employee
					case 1:
						list.forEach(e -> System.out.println(e.displayInformation()));
						break;
					
					//Search by salary (rather than 3000000)
					case 2:
						List<Employee> list1 = list.stream().filter(e -> e.getSalary() >= 3000000).collect(Collectors.toList());
						list1.forEach(e -> System.out.println(e.displayInformation()));
						break;
						
					//Search by name (contains Anh)
					case 3:
						List<Employee> list2 = list.stream().filter(e -> e.getName().contains("Anh")).collect(Collectors.toList());
						if(list2.size() > 0)
							list2.forEach(e -> System.out.println(e.displayInformation()));
						else
							System.out.println("No more employee has name contains \"Anh\"");
						break;
						
					//Calculate average age off all employee
					case 4:
						IntSummaryStatistics statistics = list.stream().mapToInt(e -> e.getAge()).summaryStatistics();
						System.out.println(String.format("Average age off all employee: %.2f", statistics.getAverage()));
						break;
						
					//find max of salary
					case 5:
						System.out.println(String.format("Max of salary: %.2f", statistics2.getMax()));
						break;
					
					//find min of salary
					case 6:
						System.out.println(String.format("Min of salary: %.2f", statistics2.getMin()));
						break;
						
					// find average of salary all employee
					case 7:
						System.out.println(String.format("Average of salary: %.2f", statistics2.getAverage()));
						break;
						
					default:
						cont = 0;
				}
			}
			
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

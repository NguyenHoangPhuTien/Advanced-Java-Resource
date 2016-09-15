package Exercise6_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/*
	 * Write new employee
	 * param : name , id , age
	 */
	public static void writeFile(String name, String id, int age){
		 Employee employee = new Employee(name, id, age);
		 try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Exercise6_4/database.txt", true));
			out.writeObject(employee);
			out.close();
			System.out.println("Add new success!");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static List<Employee> readFile(){
		List<Employee> list = new ArrayList<Employee>();
		try {
			Employee e = null;
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Exercise6_4/database.txt"));
			while((e = (Employee) in.readObject()) != null){
				e = (Employee) in.readObject();
				list.add(e);
			}
			in.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		List<Employee> list = readFile();
		try {
			int cont = 1;
			while(cont == 1){
				System.out.println("1.Add new employee");
				System.out.println("2.Print all employee");
				System.out.println("Please choice option");
				int choice = Integer.parseInt(input.readLine());
				switch(choice){
					case 1:
						System.out.println("Input name of employee: ");
						String name = input.readLine();
						System.out.println("Input id of employee: ");
						String id = input.readLine();
						System.out.println("Input age of employee: ");
						int age = Integer.parseInt(input.readLine());
						writeFile(name, id, age);
						break;
					case 2:
						list.forEach((Employee e) -> System.out.println(e.displayInformation()));
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

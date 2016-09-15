package Exercise6_4;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/*
	 * Write new employee param : name , id , age
	 */
	public static void writeFile(String name, String id, int age) {
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

	public static void readFile(List<Employee> list) throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		FileInputStream f = new FileInputStream("src/Exercise6_4/database.txt");
		if (f.available() != 0) {
			try{
				in = new ObjectInputStream(f);
				while(true){
					Employee emp = (Employee) in.readObject();
					list.add(emp);
				}
			}catch (EOFException | StreamCorruptedException e){	
			}
		}
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		List<Employee> list = new ArrayList<>();
		
		try {
			int cont = 1;
			while (cont == 1) {
				System.out.println("1.Add new employee");
				System.out.println("2.Print all employee");
				System.out.println("Please choice option");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
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
					list.removeAll(list);
					readFile(list);
					list.forEach((Employee e) -> System.out.println(e
							.displayInformation()));
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

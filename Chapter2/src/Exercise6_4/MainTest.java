package Exercise6_4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException, StreamCorruptedException {
		Employee employee = new Employee("tien", "001", 18);
		Employee employee1 = new Employee("hau", "002", 19);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"src/Exercise6_4/database.txt"));
		out.writeObject(employee);
		out.writeObject(employee1);
		out.close();

		ObjectInputStream in = null;
		List<Employee> list = new ArrayList<>();
		FileInputStream f = new FileInputStream("src/Exercise6_4/database.txt");
		if (f.available() != 0) {
			try {
				in = new ObjectInputStream(f);
				while (true) {
					Employee emp = (Employee) in.readObject();
					list.add(emp);
				}
			} catch (EOFException | StreamCorruptedException e) {

			}

		}
		list.forEach((Employee e) -> System.out.println(e.displayInformation()));
	}
}

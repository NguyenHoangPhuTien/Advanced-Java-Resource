package ManageCD;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;


public class MainText {

	/*
	 * Write all cd form list into file cd.txt
	 * param: list of cd
	 */
	public static void writeCD(List<CD> list){
		try {
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/ManageCD/cd.txt"));
			for(CD cd : list){
				out.writeObject(cd);
			}
			out.close();
			System.out.println("write success!");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Read file cd.txt , add to list and show all CD of list
	 */
	public static void readFile() throws ClassNotFoundException, IOException{
		List<CD> list = new ArrayList<>();
		ObjectInputStream in = null;
		FileInputStream f = new FileInputStream("src/ManageCD/cd.txt");
		if (f.available() != 0) {
			try {
				in = new ObjectInputStream(f);
				while (true) {
					CD cd = (CD) in.readObject();
					list.add(cd);
				}
				
			} catch (EOFException  e) {
				
			} catch(StreamCorruptedException e){
				System.out.println(e.getMessage());
			} finally {
				f.close();
			}
		}
		list.forEach(e -> System.out.println(e.displayInformation()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CDController control = new CDController();
		List<CD> list = control.findAllCD();
		list.add(new CD(3, "tinh cha", "cam ly", 19, 20000));
		writeCD(list);
		try {
			readFile();
			list.add(new CD(3, "tinh cha", "cam ly", 19, 20000));
			writeCD(list);
			readFile();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}

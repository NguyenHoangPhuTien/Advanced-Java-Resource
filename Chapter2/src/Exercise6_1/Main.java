package Exercise6_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	//Read content of file
	public static void readFile(){
		 String date = "";
		 String diary = "";
		 String content = "";
		 
		 try {
			DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/Exercise6_1/daily.txt")));
			while (in.available() > 0){
				date = in.readUTF();
				content = in.readUTF();
				diary += date + "\n" + content + "\n\n";
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(diary);
		
	}
	
	//Write content of diary into file
	public static void writeFile(){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner scan = new Scanner(System.in);
		Date d = new Date();
		String date = format.format(d);
		System.out.println("Input content: ");
		String content = scan.nextLine();
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/Exercise6_1/daily.txt",true)));
			out.writeUTF(date);
			out.writeUTF(content);
			out.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cont = 1;
		while(cont == 1){
			System.out.println("1.Read File");
			System.out.println("2.Write File");
			System.out.println("3.Exit");
			System.out.println("Choice option");
			int choice = scan.nextInt();
			switch (choice){
				case 1:
					readFile();
					break;
				case 2:
					writeFile();
					break;
				default:
					cont = 0;
			}
		}
	}

}

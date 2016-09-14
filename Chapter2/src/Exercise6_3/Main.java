package Exercise6_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import jdk.nashorn.internal.runtime.ListAdapter;

public class Main {

	/*
	 * Read file document Return a list of student
	 */
	public static List<Student> readFile() {

		List<Student> list = new ArrayList<>();
		try {
			DataInputStream in = new DataInputStream(new BufferedInputStream(
					new FileInputStream("src/Exercise6_3/tongketnamhoc.txt")));
			while (in.available() > 0) {
				String name = in.readUTF();
				int grade = in.readInt();
				double semaster1 = in.readDouble();
				double semaster2 = in.readDouble();
				Student student = new Student(name, grade, semaster1, semaster2);
				list.add(student);
			}
			in.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	// Write content of diary into file
	public static void writeFile(String name, int grade, double semaster1, double semaster2) {
	
		try {
			DataOutputStream out = new DataOutputStream(
					new BufferedOutputStream(new FileOutputStream(
							"src/Exercise6_3/tongketnamhoc.txt", true)));
			out.writeUTF(name);
			out.writeInt(grade);
			out.writeDouble(semaster1);
			out.writeDouble(semaster2);
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		List<Student> list = readFile();
		try {
			int cont = 1;
			while (cont == 1) {
				System.out.println("1.Print information all student");
				System.out.println("2.Print information student for grade");
				System.out.println("3.Calculate avarage mark for grade");
				System.out.println("4.Add new student");
				System.out.println("5.Print informaiton for each grade");
				System.out.println("6.Exit");
				System.out.println("Please choice option");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				case 1:
					list.forEach((Student e) -> System.out.println(e
							.displayInformation()));
					break;
				case 2:
					System.out.println("Input grade want to search: ");
					int grade = Integer.parseInt(input.readLine());
					List<Student> list1 = list.stream()
							.filter((Student e) -> e.getGrade() == grade)
							.collect(Collectors.toList());
					list1.forEach((Student e) -> System.out.println(e
							.displayInformation()));
					break;
				case 3:
					System.out.println("Input grade want to search: ");
					int grade1 = Integer.parseInt(input.readLine());
					List<Student> list2 = list.stream()
							.filter((Student e) -> e.getGrade() == grade1)
							.collect(Collectors.toList());
					int i = 0;
					double avarage = 0;
					for (Student e : list2) {
						avarage += Double.parseDouble(e.calAvarage());
						i += 1;
					}
					avarage = avarage / i;
					System.out.println(String.format("Avarage: %.2f", avarage));
					break;
				case 4:
					System.out.println("Input name of student: ");
					String name = input.readLine();
					System.out.println("Input grade of student: ");
					int grade2 = Integer.parseInt(input.readLine());
					System.out.println("Input semaster 1: ");
					double semaster1 = Double.parseDouble(input.readLine());
					System.out.println("Input semaster 2: ");
					double semaster2 = Double.parseDouble(input.readLine());
					writeFile(name, grade2, semaster1, semaster2);
					break;
				case 5:
					Collections.sort(list, (Student s1, Student s2) -> Integer.compare(s1.getGrade(), s2.getGrade()));
					int countGood = 0;
					int countRather = 0;
					int countMedium = 0;
					int countBad = 0;
					int grade3 = list.get(0).getGrade();
					int count = 0;
					double avarage1 = 0;
					for(int j = 0; j < list.size(); j++){
						Student e = list.get(j);
						if(e.evalResult().equals("exellent"))
							countGood += 1;
						else if(e.evalResult().equals("rather"))
							countRather += 1;
						else if(e.evalResult().equals("medium"))
							countMedium += 1;
						else
							countBad += 1; 
						if(e.getGrade() == grade3){
							System.out.println(e.displayInformation());
							avarage1 += Double.parseDouble(e.calAvarage());
							count += 1;
							if(j == list.size() - 1){
								avarage1 = avarage1 / count;
								System.out.println("Avarage of grade: " + avarage1);
								System.out.println();
							}
						}
						else{
							avarage1 = avarage1 / count;
							System.out.println("Avarage of grade: " + avarage1);
							System.out.println();
							System.out.println(e.displayInformation());
							avarage1 = Double.parseDouble(e.calAvarage());;
							count = 1;
							grade3 = e.getGrade();
						}
							
					}
					System.out.println("Exellent: " + countGood);
					System.out.println("Rather: " + countRather);
					System.out.println("Medium: " + countMedium);
					System.out.println("Bad: " + countBad);
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

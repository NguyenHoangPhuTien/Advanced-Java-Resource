package ManagerSchool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

import WarGame.MainGameSoliderTest;

public class MainManagerSchoolTest {

	public static void main(String[] args) {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			int cont = 1;
			Teacher[] listTeacher = new Teacher[0];
			Student[] listStudent = new Student[0];
			while(cont == 1){
				int choice = 0;
				System.out.println("Input name: ");
				String name = buff.readLine();
				System.out.println("Input your birthday: ");
				String birthDay = buff.readLine();
				System.out.println("Input your address: ");
				String address = buff.readLine();
				System.out.println("Input your phone: ");
				String phone = buff.readLine();
				System.out.println("1.Teacher");
				System.out.println("2.Student");
				System.out.println("Please choice option(1 or 2");
				choice = Integer.parseInt(buff.readLine());
				
				/*
				 * With choice of customer: class corresponding will be create with fields and add into corresponding array. 
				 */
				switch(choice){
				
					case 1:
						System.out.println("Input coefficients salary of teacher: ");
						double coef = Double.parseDouble(buff.readLine());
						if(coef <= 0)
							System.out.println("coefficients salary can not be less 0");
						else{
							System.out.println("Input class of teacher");
							String leaderClass = buff.readLine();
							System.out.println("Input bonus salary: ");
							double bonus = Double.parseDouble(buff.readLine());
							if(bonus < 0)
								System.out.println("bonus salary can not be less 0");
							else{
								Teacher teacher = new Teacher(name, birthDay, address, phone, coef, bonus, leaderClass);
								listTeacher = Arrays.copyOf(listTeacher, listTeacher.length + 1);
								listTeacher[listTeacher.length - 1] = teacher;
							}
						}
						break;
					case 2:
						System.out.println("Input class of student: ");
						String classStudent = buff.readLine();
						System.out.println("Input pointSemester 1: ");
						double point_1 = Double.parseDouble(buff.readLine());
						if(point_1 < 0)
							System.out.println("pointSemester 1 can not be less 0");
						else{
							System.out.println("Input pointSemester 2: ");
							double point_2 = Double.parseDouble(buff.readLine());
							if(point_2 < 0)
								System.out.println("pointSemester 2 can not be less 0");
							else{
								Student student = new Student(name, birthDay, address, phone, classStudent, point_1, point_2);
								listStudent = Arrays.copyOf(listStudent, listStudent.length + 1);
								listStudent[listStudent.length - 1] = student;
							}
						}
					default:
						System.out.println("Please choice option 1 or 2");
						
				}
				
				/*
				 * 
				 */
				
				System.out.println("Continue ? (1/2)");
				int choose = Integer.parseInt(buff.readLine());
				if(choose != 1)
					cont = 0;
			}
			if(listTeacher.length > 0){
				for(Teacher teacher : listTeacher){
					System.out.println(teacher.toString());
				}
					
			}
			if(listStudent.length > 0)
				for(Student student : listStudent)
					System.out.println(student.toString());
				
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}

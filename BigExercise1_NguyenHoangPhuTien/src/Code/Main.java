package Code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Main {

	/*
	 * Create default database of Class return result as Class type
	 */
	public static Class createData() {
		// List of student
		List<Student> listStudent = new ArrayList<>();
		Student student_1 = new Student("A@gmail.com", "Nguyen Van A", "090909", "1/1");
		Student student_2 = new Student("B@gmail.com", "Nguyen Van B", "080808", "2/1");
		listStudent.add(student_1);
		listStudent.add(student_2);

		// Information of teacher Ms.Phuong
		List<String> listPhuong = new ArrayList<>();
		listPhuong.add("Java");
		listPhuong.add("OOM");
		Teacher ktPhuong = new Teacher("ktphuong@gmail.com", "Phuong", "0123456789", listPhuong);

		// Information of teacher Mr.Trung
		List<String> subjectTrung = new ArrayList<>();
		subjectTrung.add("Linux");
		Teacher Trung = new Teacher("trung@gmail.com", "Trung", "0123456", subjectTrung);

		// List of subject
		Subject java = new Subject("10/10", "Java", 12, "11/9", ktPhuong);
		Subject linux = new Subject("9/10", "Linux", 12, "11/8", Trung);
		List<Subject> subjects = new ArrayList<>();
		subjects.add(java);
		subjects.add(linux);

		Class gcs = new Class("10/10", "Training", "001", 24, "11/8", subjects, listStudent, ktPhuong);

		// Create mark session of Student A of java subject and linux subject
		MarkSession javaSession_1A = new MarkSession(10, 10, 10);
		MarkSession javaSession_2A = new MarkSession(10, 10, 10);
		MarkSession javaSession_3A = new MarkSession(10, 10, 10);
		MarkSession linuxSession_1A = new MarkSession(10, 10, 10);
		MarkSession linuxSession_2A = new MarkSession(10, 10, 10);
		MarkSession linuxSession_3A = new MarkSession(10, 10, 10);

		// Create mark session of Student B of java subject and linux subject
		MarkSession javaSession_1B = new MarkSession(10, 10, 10);
		MarkSession javaSession_2B = new MarkSession(10, 10, 10);
		MarkSession javaSession_3B = new MarkSession(10, 10, 10);
		MarkSession linuxSession_1B = new MarkSession(10, 10, 10);
		MarkSession linuxSession_2B = new MarkSession(10, 10, 10);
		MarkSession linuxSession_3B = new MarkSession(10, 10, 10);

		// Create detail mark table of Student A of java subject
		List<MarkSession> listJava_A = new ArrayList<>();
		listJava_A.add(javaSession_1A);
		listJava_A.add(javaSession_2A);
		listJava_A.add(javaSession_3A);
		FinalGrade finalJava_A = new FinalGrade(listJava_A, new MarkExam(8, 8));
		DetailMarkTable detailJava_A = new DetailMarkTable(java, student_1, finalJava_A);

		// Create detail mark table of Student A of linux subject
		List<MarkSession> listLinux_A = new ArrayList<>();
		listLinux_A.add(linuxSession_1A);
		listLinux_A.add(linuxSession_2A);
		listLinux_A.add(linuxSession_3A);
		FinalGrade finalLinux_A = new FinalGrade(listLinux_A, new MarkExam(7, 7));
		DetailMarkTable detailLinux_A = new DetailMarkTable(linux, student_1, finalLinux_A);

		// Create detail mark table of Student B of java subject
		List<MarkSession> listJava_B = new ArrayList<>();
		listJava_B.add(javaSession_1B);
		listJava_B.add(javaSession_2B);
		listJava_B.add(javaSession_3B);
		FinalGrade finalJava_B = new FinalGrade(listJava_B, new MarkExam(8, 8));
		DetailMarkTable detailJava_B = new DetailMarkTable(java, student_2, finalJava_B);

		// Create detail mark table of Student B of linux subject
		List<MarkSession> listLinux_B = new ArrayList<>();
		listLinux_B.add(linuxSession_1B);
		listLinux_B.add(linuxSession_2B);
		listLinux_B.add(linuxSession_3B);
		FinalGrade finalLinux_B = new FinalGrade(listLinux_B, new MarkExam(7, 7));
		DetailMarkTable detailLinux_B = new DetailMarkTable(linux, student_2, finalLinux_B);
		
		//Create Mark Table 
		List<DetailMarkTable> listDetail = new ArrayList<>();
		listDetail.add(detailJava_A);
		listDetail.add(detailLinux_A);
		listDetail.add(detailJava_B);
		listDetail.add(detailLinux_B);
		MarkTable markTable = new MarkTable(listDetail);
		
		gcs.setM_MarkTable(markTable);
		return gcs;

	}

	/*
	 * Create new Student
	 * Return result as a Student type
	 */
	public static Student createStudent(BufferedReader input) throws IOException{
		
		System.out.println("Input name of student: ");
		String name = input.readLine();
		System.out.println("Input email of student: ");
		String email = input.readLine();
		System.out.println("Input phone of student: ");
		String phone = input.readLine();
		System.out.println("Input birthday of student: ");
		String birthday = input.readLine();
		Student student = new Student(email, name, phone, birthday);
		return student;
	}
	
	/*
	 * Create new final grade for a student of java subject
	 * Return result as Final Grade type
	 */
	public static FinalGrade createFinalGradeJava(BufferedReader input) throws NumberFormatException, IOException{
		
		System.out.println("This is java subject");
		FinalGrade finalGrade = new FinalGrade();
		List<MarkSession> listMarkSession = new ArrayList<>();
		
		//Create 3 mark session and add to list 
		for(int i = 1; i <= 3; i++){
			System.out.println();
			System.out.println("Session " + i);
			double markAttendence = 0;
			double markActive = 0;
			double markExercise = 0;
			
			boolean flagAttendence = true;
			while(flagAttendence == true){
				System.out.println("Input mark attendence: ");
				markAttendence = Double.parseDouble(input.readLine());
				if(markAttendence < 0 || markAttendence > 10){
					System.out.println("Mark attendence must be greater than 0 and less than 10");
				}
				else
					flagAttendence = false;
			}
			
			boolean flagActive = true;
			while(flagActive == true){
				System.out.println("Input mark active: ");
				markActive = Double.parseDouble(input.readLine());
				if(markActive < 0 || markActive > 10)
					System.out.println("Mark active must be greater than 0 and less than 10");
				else
					flagActive = false;
			}
			
			boolean flagExerce = true;
			while(flagExerce == true){
				System.out.println("Input mark exercise: ");
				markExercise = Double.parseDouble(input.readLine());
				if(markExercise < 0 || markExercise > 10)
					System.out.println("Mark exercise must be greater than 0 and less than 10");
				else
					flagExerce = false;
			}
			
			MarkSession markSession = new MarkSession(markAttendence, markActive, markExercise);
			listMarkSession.add(markSession);
		}
		
		System.out.println();
		//Create mark exam
		double practice = 0;
		double multichoice = 0;
		
		boolean flagPractice = true;
		while(flagPractice == true){
			System.out.println("Input mark practice exam: ");
			practice = Double.parseDouble(input.readLine());
			if(practice < 0 || practice > 10)
				System.out.println("Mark practice exam must be greater than 0 and less than 10");
			else
				flagPractice = false;
		}
		
		boolean flagMulti = true;
		while(flagMulti == true){
			System.out.println("Input mark multichoice exam: ");
			multichoice = Double.parseDouble(input.readLine());
			if(multichoice < 0 || multichoice > 10)
				System.out.println("Mark mulitchoice exam must be greater than 0 and less than 10");
			else
				flagMulti = false;
		}
		
		MarkExam markExam = new MarkExam(multichoice, practice);
		
		finalGrade.setList(listMarkSession);
		finalGrade.setM_MarkExam(markExam);
		return finalGrade;
	}
	
	/*
	 * Create new final grade for a student of java subject
	 * Return result as Final Grade type
	 */
	public static FinalGrade createFinalGradeLinux(BufferedReader input) throws NumberFormatException, IOException{
		
		System.out.println("This is linux subject");
		FinalGrade finalGrade = new FinalGrade();
		List<MarkSession> listMarkSession = new ArrayList<>();
		
		//Create 3 mark session and add to list 
		for(int i = 1; i <= 3; i++){
			System.out.println("Session " + i);
			System.out.println("Input mark attendence: ");
			double markAttendence = Double.parseDouble(input.readLine());
			System.out.println("Input mark active: ");
			double markActive = Double.parseDouble(input.readLine());
			System.out.println("Input mark exercise: ");
			double markExercise = Double.parseDouble(input.readLine());
			MarkSession markSession = new MarkSession(markAttendence, markActive, markExercise);
			listMarkSession.add(markSession);
		}
		
		//Create mark exam
		System.out.println("Input mark practice exam: ");
		double practice = Double.parseDouble(input.readLine());
		System.out.println("Input mark multichoice exam: ");
		double multichoice = Double.parseDouble(input.readLine());
		MarkExam markExam = new MarkExam(multichoice, practice);
		
		finalGrade.setList(listMarkSession);
		finalGrade.setM_MarkExam(markExam);
		return finalGrade;
	}
	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Class gcs = createData();
		System.out.println(gcs.toString());
		System.out.println();
		System.out.println("====================================");
		
		try {
			int cont = 1;
			while(cont == 1){
				System.out.println("1.Print information of Students in class");
				System.out.println("2.Print information of Subject in class ");
				System.out.println("3.Print information of master teacher");
				System.out.println("4.Print all mark table of all student");
				System.out.println("5.Add new student");
				System.out.println("6.Exit");
				System.out.println("Please choice 1 or 2 or 3 or 4 or 5 or 6");
				int choice = Integer.parseInt(input.readLine());
				
				switch(choice){
					//Print information all student
					case 1:
						List<Student> listStudent = gcs.getM_Student();
						for(Student student : listStudent){
							System.out.println(student.toString());
							System.out.println("=============================");
						}
						break;
						
					//Print information all subject
					case 2:
						List<Subject> listSubject = gcs.getListSubject();
						for(Subject subject : listSubject){
							System.out.println(subject.toString());
							System.out.println("=============================");
						}
						break;
					
					//Print information of teacher
					case 3:
						Teacher teacher = gcs.getM_Teacher();
						System.out.println(teacher.toString());
						break;
						
					//Print all mark of each student
					case 4:
						List<DetailMarkTable> listDetailMark = gcs.getM_MarkTable().getList();
						for(DetailMarkTable detail : listDetailMark){
							System.out.println(detail.getM_Student().toString());
							System.out.println(detail.getM_Subject().toString());
							double practice = detail.getM_FinalGrade().getM_MarkExam().getMarkPractice();
							double multichoice = detail.getM_FinalGrade().getM_MarkExam().getMarkMultiChoice();
							System.out.println("Mark of practice: " + practice);
							System.out.println("Mark of multichoice: " + multichoice);
							List<MarkSession> listSession = detail.getM_FinalGrade().getList();
							int i = 1;
							for(MarkSession markSession : listSession){
								System.out.println();
								System.out.println("Session " + i);
								System.out.println("Mark active : " + markSession.getMarkActive());
								System.out.println("Mark exercise" + markSession.getMarkExercise());
								System.out.println("Mark attendence: " + markSession.getMarkAttendence());
								
								i++;
							}
							System.out.println();
							System.out.println("Total mark: " + detail.getM_FinalGrade().calFinalGrade());
							System.out.println("============================================");
						}
						break;
					
					//Add new student
					case 5:
						Student student = createStudent(input);
						gcs.addStudent(student);
						FinalGrade java = createFinalGradeJava(input);
						FinalGrade linux = createFinalGradeLinux(input);
						List<Subject> listSub= gcs.getListSubject();
						MarkTable markTable = gcs.getM_MarkTable();
						for(Subject subject : listSub){
							if(subject.getNameOfSubject().equals("Java")){
								DetailMarkTable detailJava = new DetailMarkTable(subject, student, java);
								markTable.addDetailMarkTable(detailJava);
							}
							else{
								DetailMarkTable detailLinux = new DetailMarkTable(subject, student, linux);
								markTable.addDetailMarkTable(detailLinux);
							}
						}
						break;
						
					//Exit application
					case 6:
						cont = 0;
						break;
					default:
						System.out.println("Choice is incorrect");
				}
			}
			
		} catch (NumberFormatException | IOException | InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}

package Exercise4_3;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student(18, "nguyen van a", 8.0, 7.8);
		Student st2 = new Student(20, "nguyen van b", 8.0, 8.8);
		Student st3 = new Student(21, "nguyen van c", 5.0, 7.8);
		Student st4 = new Student(17, "nguyen van d", 6.0, 6.8);
		Student st5 = new Student(23, "nguyen van e", 5.0, 4.8);
		Student st6 = new Student(22, "nguyen van f", 5.0, 2.8);
		Student st7 = new Student(17, "nguyen van g", 9.0, 7.8);
		Student st8 = new Student(23, "nguyen van h", 10.0, 7.8);
		Student st9 = new Student(18, "nguyen van m", 5.0, 5.8);
		Student st10 = new Student(18, "nguyen van n", 5.0, 9.8);
		
		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		list.add(st6);
		list.add(st7);
		list.add(st8);
		list.add(st9);
		list.add(st10);
		
		//Print information of student and avarage of mark
		list.forEach((Student a) -> System.out.println(a.displayInformation() + " avg = " + a.findAvarageMark()));
		
		//count student has age >= 18
		int countAge = (int) list.stream().filter((Student a) -> a.age >= 18).count();
		System.out.println("Count: " + countAge);
		
		//Get list first name start name with "H" and print information
		List<Student> list1 = list.stream().filter((Student a) -> a.name.startsWith("H")).collect(Collectors.toList());
		list1.forEach((Student a) -> System.out.println(a.displayInformation()));
		
		//Find max avarage, min avarage, get avarage of all
		List<Double> listAverage = new ArrayList<>();
		list.forEach((Student a) -> listAverage.add(a.findAvarageMark()));
		
		DoubleSummaryStatistics summaryStatistics = listAverage.stream().mapToDouble(a -> a).summaryStatistics();
		System.out.println("Avarage max: " + summaryStatistics.getMax());
		System.out.println("Avarage min: " + summaryStatistics.getMin());
		System.out.println("Avarage of all: " + summaryStatistics.getAverage());
		
		//Create list very good student has avarage >=8
		List<Student> listGood = list.stream().filter((Student a) -> a.findAvarageMark() >= 8).collect(Collectors.toList());
		listGood.forEach((Student a) -> System.out.println(a.displayInformation()));
	}
}

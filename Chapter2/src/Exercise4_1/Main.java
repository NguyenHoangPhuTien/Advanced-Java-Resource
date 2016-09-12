package Exercise4_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("", "Tien", "tiEn", "Phu Tien", "", "Tien Hau",
				" abc" , "abc", "acd");
		
		//Count element is empty
		int countEmpty = (int) list.stream().filter(a -> a.isEmpty()).count();
		System.out.println("Count element empty: " + countEmpty);
		
		//Count element has lenght >= 5
		int countLength = (int) list.stream().filter(a -> a.length() >= 5).count();
		System.out.println("Count element has length >= 5: " + countLength);
		
		//Count element start "a"
		int countStart = (int) list.stream().filter(a -> a.startsWith("a")).count();
		System.out.println("Count element start with \"a\": " + countStart);
		
		//Count element equal "happy"
		int countEqual = (int) list.stream().filter(a -> a.equals("happy")).count();
		System.out.println("Count element equal \"happy\": " + countEqual);
		
		//Create List 2 from list 1 with element is empty
		List<String> list2 = list.stream().filter(a -> !a.isEmpty()).collect(Collectors.toList());
		countEmpty = (int) list2.stream().filter(a -> !a.isEmpty()).count();
		System.out.println("Count element of list 2: " + countEmpty);
		
		//Create List 3 from list 1
		List<String> list3 = list.stream().filter(a -> a.length() >= 3 && a.length() <= 6).collect(Collectors.toList());
		System.out.println();
		list3.forEach(s -> System.out.print(s + ", "));
		
		//Create List 4 from list 1
		List<String> list4 = list.stream().map(a -> a + " happy").collect(Collectors.toList());
		System.out.println();
		list4.forEach(s -> System.out.print(s + ", "));
		
	}

}

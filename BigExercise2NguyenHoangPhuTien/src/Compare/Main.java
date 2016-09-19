package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
				List<String> list = new ArrayList<>();
				list.add("abc");
				list.add("de");
				list.add("f");
				list.add("mnog");
				
				String a = "";
				a.length();
				
				//Order by length of element auto increment
				System.out.println("Order by length of element auto increment");
				Collections.sort(list, (String o1, String o2) -> Integer.compare(o1.length(), o2.length()));
				list.forEach(e -> System.out.println(e));
				
				System.out.println();
				
				//Order by length of element auto decrement
				System.out.println("Order by length of element auto decrement");
				Collections.sort(list, (String o1, String o2) -> Integer.compare(o2.length(), o1.length()));
				list.forEach(e -> System.out.println(e));

				System.out.println();
				
				//Order by Alphabet
				System.out.println("Order by Alphabet");
				Collections.sort(list, (String o1, String o2) -> o1.compareTo(o2));
				list.forEach(e -> System.out.println(e));
	}
}

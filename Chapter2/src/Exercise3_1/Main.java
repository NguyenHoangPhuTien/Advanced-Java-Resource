package Exercise3_1;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		//Without lambda expression
		for(int i : list)
			System.out.println(i);
		
		System.out.println("==================");
		
		//With lambda expression
		list.forEach(i -> System.out.println(i));
		
	}
}

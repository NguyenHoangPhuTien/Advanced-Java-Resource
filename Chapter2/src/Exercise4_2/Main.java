package Exercise4_2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	//Check Primary number
	public static boolean checkPrimary(int a) {
		boolean check = true;
		if(a <= 2)
			check = false;
	    for (int i = 2; i <= Math.sqrt(a); i++) {
	        if (a % i == 0) {
	            check = false;
	        }
	    }
	    return check;
	}

	//Check Square number
	public static boolean checkSquare(int a){
		
		if(a <= 0)
			return false;
		else{
			int temp = (int) Math.sqrt(a);
			if(temp * temp == a)
				return true;
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 8, 6, 10, 8);
		list.forEach(a ->System.out.print(a + " "));
		
		//Create List 2
		List<Integer> list1 = list.stream().map(a -> a * a).collect(Collectors.toList());
		list1.forEach(a ->System.out.print(a + " "));
		
		IntSummaryStatistics statistics = list1.stream().mapToInt(a -> a).summaryStatistics();
		System.out.println("Max in list 2: " + statistics.getMax());
		System.out.println("Min in list 2: " + statistics.getMin());
		System.out.println("Sum of list 2: " + statistics.getSum());
		System.out.println("Sum of list 2: " + statistics.getAverage());
		
		//Create list 3
		List<Integer> list3 = list1.stream().filter(a -> checkPrimary(a) == true).collect(Collectors.toList());
		list3.forEach(a -> System.out.print(a + " "));
		
		//Create list 4
		List<Integer> list4 = list1.stream().filter(a -> checkSquare(a) == true).collect(Collectors.toList());
		list4.forEach(a -> System.out.print(a + " "));

	}
}

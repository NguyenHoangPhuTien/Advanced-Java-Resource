package Exercise3_2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		int price = 1000;
		
		list.forEach(i -> System.out.println(i * price));
	}
}

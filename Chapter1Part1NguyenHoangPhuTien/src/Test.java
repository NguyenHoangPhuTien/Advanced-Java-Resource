import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ac = {1, 2, 3};
		
		ac = Arrays.copyOf(ac, ac.length + 1);
		ac[ac.length - 1] = 4;
		System.out.println(Arrays.toString(ac));

	}

}

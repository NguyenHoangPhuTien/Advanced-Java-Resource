import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

	public static void changeString(int[] s){
		
		s[0] = 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = {2,3,4};
		changeString(s);
		System.out.println(Arrays.toString(s));
	}

}

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test {

	public static void changeString(int[] s){
		
		s[0] = 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		System.out.println(format.format(date));
		
		boolean a = true;
		if(a)
			System.out.println("yess");
	}

}

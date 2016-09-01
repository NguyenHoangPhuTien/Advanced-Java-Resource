package SingletonPatter;

/*
 * CLass teacher for singleton pattern
 * Date : 1/9/2016
 * Author : Nguyen Hoang Phu Tien
 * Version : 1.0;
 */
public class Teacher {

	private static Teacher instance = new Teacher();
	
	private Teacher(){
		
	}
	
	public static Teacher getIntace(){
		
		return instance;
	}
	
	/*
	 * Get document shared by Teacher
	 * Return result as a String.
	 */
	public String shareDocument(){
		
		return "Refence document: \n-Chapter 1: \n-Chapter 2: \n";
	}
	
	/*
	 * Get name of teacher.
	 * Return result as a String
	 */
	public String getName(){
		return "Nguyen van a";
	}

}

package SingletonPatter;

public class MainSingletonPattern {

	public static void main(String[] args) {
		
		Teacher teacher = Teacher.getIntace();
		System.out.println(teacher.shareDocument());
		System.out.println(teacher.getName());
	}
}

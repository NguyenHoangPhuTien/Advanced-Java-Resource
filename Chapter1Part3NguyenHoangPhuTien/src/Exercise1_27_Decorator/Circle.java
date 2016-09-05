package Exercise1_27_Decorator;

/**
 *  @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 05-September-2016 10:40:51 AM
 * @class for implements interface Shape
 */
public class Circle implements Shape {

	public Circle(){

	}

	@Override
	public String draw(){
		return "Shape: Circle with normal border";
	}

}
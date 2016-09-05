package Exercise1_27_Decorator;

/**
 *  @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 05-September-2016 10:40:51 AM
 * @class for declare RedShapeDecorator class extends abstract ShapeDecorator class
 */
public class RedShapeDecorator extends ShapeDecorator {
	
	public RedShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String draw(){
		
		return shape.draw() + " and " + setRedBorder();
	}

	public String setRedBorder(){
		return "Border Color: Red";
	}

}
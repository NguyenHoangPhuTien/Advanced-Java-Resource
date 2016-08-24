package InnerClassGiftbox;

/**
 * @author Nguyen Hoang Phu Tien
 * Class about information giftbox
 * Version 1.0.
 * Date : 24/8/2016
 */

public class GiftBox {

	public String shape;
	public String color;
	
	final int PRICE = 10000;

	public GiftBox() {
		super();
	}

	public GiftBox(String shape, String color) {
		super();
		this.shape = shape;
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return PRICE;
	}
	
	public class Gift{
		public String name;
		public double weight;
		final int FEE = 200;
		
		public Gift(String name, double weight) {
			super();
			this.name = name;
			this.weight = weight;
		}
		
		/*
		 * calculate fee of giftbox.
		 * Return result as double type.
		 */
		public double calFee(){
			
			return weight * FEE + GiftBox.this.PRICE;
		}
		
	}
}

package ComputerProduct;

public class Desktop extends Computer{
	
	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 21/8/2016.
	 * Version : 1.
	 * Class information of Desktop.
	 * This class extend by Computer class.
	 */

	String CPU;
	int RAM;
	
	public Desktop() {
		super();
	}

	public Desktop(String numberProduct, String manufacturer, double price, int numberImport, String cPU, int rAM) {
		super(numberProduct, manufacturer, price, numberImport);
		CPU = cPU;
		RAM = rAM;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	/*
	 * Get full information of product.
	 * Return result as string type.
	 */
	@Override
	public String toString() {
		return "Desktop CPU : " + CPU + ", RAM : " + RAM + ", numberProduct : " + numberProduct + ", manufacturer : "
				+ manufacturer + ", price : " + price + ", numberImport : " + numberImport;
	}
	
	
	
}

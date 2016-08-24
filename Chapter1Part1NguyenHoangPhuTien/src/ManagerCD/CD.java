package ManagerCD;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 19/8/2016.
 * Version : 1.
 * Class information of CD.
 */

public class CD {

	String codeCD;
	String nameCD;
	String singer;
	int numberOfSing;
	double price;
	
	public CD() {
		super();
	}

	public CD(String codeCD, String nameCD, String singer, int numberOfSing, double price) {
		super();
		this.codeCD = codeCD;
		this.nameCD = nameCD;
		this.singer = singer;
		this.numberOfSing = numberOfSing;
		this.price = price;
	}

	public String getCodeCD() {
		return codeCD;
	}

	public void setCodeCD(String codeCD) {
		this.codeCD = codeCD;
	}

	public String getNameCD() {
		return nameCD;
	}

	public void setNameCD(String nameCD) {
		this.nameCD = nameCD;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberOfSing() {
		return numberOfSing;
	}

	public void setNumberOfSing(int numberOfSing) {
		this.numberOfSing = numberOfSing;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		
		return "codeCD : " + codeCD + ", nameCD : " + nameCD + ", singer : " + singer 
				+ ", numberOfSing : " + numberOfSing + ", price : " + price ;
	}
	
	
}

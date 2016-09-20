package ManageCD;

import java.io.Serializable;

/*
 * Nguyen Hoang Phu Tien
 * version: 1.0
 * Class about information of CD
 */
public class CD implements Serializable{

	private int id;
	private String name;
	private String singer;
	private int numberSongs;
	double price;
	
	public CD() {
		super();
	}

	public CD(int id, String name, String singer, int numberSongs, double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numberSongs = numberSongs;
		this.price = price;
	}

	public CD(String name, String singer, int numberSongs, double price) {
		super();
		this.name = name;
		this.singer = singer;
		this.numberSongs = numberSongs;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberSongs() {
		return numberSongs;
	}

	public void setNumberSongs(int numberSongs) {
		this.numberSongs = numberSongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/*
	 * display all information of CD
	 * Return result as a String type
	 */
	public String displayInformation(){
		return "Name of cd: " + name + "\nid: " + id + "\nsinger: " + singer
				+ "\nnumber of songs: " + numberSongs + "\nprice: " + price
				+ "\n-------------------------";
	}

	/*
	 * compare with two cd
	 * return result as a boolean type
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CD){
			CD cd = (CD) obj;
			if(this.id == cd.getId() && this.name.equals(cd.getName())
					&& this.singer.equals(cd.getSinger()) && this.numberSongs == cd.getNumberSongs()
					&& this.price == cd.getPrice())
				return true;
		}
		return false;
	}
	
	
}

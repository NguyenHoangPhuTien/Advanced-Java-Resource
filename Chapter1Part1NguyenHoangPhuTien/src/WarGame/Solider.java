package WarGame;


/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 20/8/2016.
 * Version : 1.
 * Description of solider.
 */

public class Solider {
	
	String name;
	int power;
	String weapon;
	
	public Solider() {
		super();
	}

	public Solider(String name, int power, String weapon) {
		super();
		this.name = name;
		this.power = power;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	/*
	 * Show information of Solider.
	 * Return result as String type.
	 */
	@Override
	public String toString() {
		return "Solider name : " + name + ", power : " + power + ", weapon : " + weapon ;
	}

	/*
	 * Power of solider will decrease 1 when call method.
	 */
	public void fight(){
		this.setPower(this.getPower() - 1);
	}
}

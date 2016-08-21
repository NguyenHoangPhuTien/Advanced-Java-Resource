package ManagerSchool;

public class Manager {

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 21/8/2016.
	 * Version : 1.
	 * Class about manager all student or teacher.
	 */
	
	iClass[] listClass;
	
	public Manager() {
		super();
	}

	public Manager(iClass[] listClass) {
		super();
		this.listClass = listClass;
	}

	public iClass[] getListClass() {
		return listClass;
	}

	public void setListClass(iClass[] listClass) {
		this.listClass = listClass;
	}
	
	/*
	 * 
	 */
	public int findSize(){
		
		return listClass.length;
	}
}

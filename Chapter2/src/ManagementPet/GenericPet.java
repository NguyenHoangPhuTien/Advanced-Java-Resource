package ManagementPet;

import java.util.List;

/*
 * Nguyen Hoang Phu Tien
 * Version : 1.0
 * Date : 7/9/2016
 * Class for generic manage pet
 */
public class GenericPet<T> {

	List<T> list;

	public GenericPet() {
		super();
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}

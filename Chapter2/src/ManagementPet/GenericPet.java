package ManagementPet;

import java.util.List;

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

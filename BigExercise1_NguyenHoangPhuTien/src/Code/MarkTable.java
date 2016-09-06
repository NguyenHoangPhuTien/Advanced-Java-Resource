package Code;
import java.util.List;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 06-Sep-2016 10:27:08 AM
 * Class about information mark table
 */
public class MarkTable {

	private List<DetailMarkTable> list;

	public MarkTable(){

	}
	
	public MarkTable(List<DetailMarkTable> list) {
		super();
		this.list = list;
	}

	public List<DetailMarkTable> getList() {
		return list;
	}

	public void setList(List<DetailMarkTable> list) {
		this.list = list;
	}

	/*
	 * Add new detail mark table into list
	 * param: Detail mark table
	 */
	public void addDetailMarkTable(DetailMarkTable detail){
		list.add(detail);
	}
	
}
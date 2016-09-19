package ManageCD;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<CD> list = new ArrayList<>();
		list.add(new CD(1, "tinh em", "minh thuan", 10, 20000));
		list.add(new CD(2, "tinh anh", "dan truong", 15, 30000));
		list.add(new CD(6, "tinh cha", "cam ly", 11, 12000));
		list.add(new CD(7, "tinh me", "minh tuyet", 14, 18000));
		
		List<CD> list1 = new ArrayList<>();
		list1.add(new CD(1, "tinh em", "minh thuan", 10, 20000));
		list1.add(new CD(2, "tinh anh", "dan truong", 15, 30000));
		list1.add(new CD(6, "tinh cha", "cam ly", 11, 12000));
		list1.add(new CD(7, "tinh me", "minh tuyet", 14, 18000));
		
		boolean ac = true;
		for(int i = 0; i < list.size(); i++){
			if(!list.get(i).equals(list1.get(i)))
					ac = false;
		}
		System.out.println(ac);
	}

}

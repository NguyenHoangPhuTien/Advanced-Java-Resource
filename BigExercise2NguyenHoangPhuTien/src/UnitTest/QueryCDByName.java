package UnitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ManageCD.CD;
import ManageCD.CDController;

/*
 * Nguyen Hoang Phu Tien
 * verison : 1.0
 * date: 19/9/2016
 * Test for query cds form database by name
 */
public class QueryCDByName {

	CDController control = new CDController();
	
	@Test
	public void test1() {
		
		List<CD> list = control.searchCDByName("tinh");
		
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
		assertTrue(ac);
	}

	@Test
	public void test2() {
		
		List<CD> list = control.searchCDByName("con ca");
		
		List<CD> list1 = new ArrayList<>();
		list1.add(new CD(1, "tinh em", "minh thuan", 10, 20000));
		list1.add(new CD(2, "tinh anh", "dan truong", 15, 30000));
		list1.add(new CD(6, "tinh cha", "cam ly", 11, 12000));
		list1.add(new CD(7, "tinh me", "minh tuyet", 14, 18000));
		
		boolean ac = true;
		for(int i = 0; i < list.size(); i++){
			if(!(list.get(i).equals(list1.get(i)))){
				ac = false;
				break;
			}
					
			
		}
		assertFalse(ac);
	}
}

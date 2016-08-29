package SaleManagementUnitAndTestSuite;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import SaleManagement.Order;
import SaleManagement.OrderDetail;
import SaleManagement.Product;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 29/8/2016.
 * Version : 1.0.
 * Test for get total money customer must pay for order.
 * Output : return result as double type.
 */

public class CalculateMoneyOfOrder {

	Order order = new Order();
	
	@Test
	public void test1() {
		
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		
		OrderDetail order1 = new OrderDetail(1, new Product("Egg", 2000));
		OrderDetail order2 = new OrderDetail(1, new Product("Fish", 3000));
		list.add(order1);
		list.add(order2);
		
		order.setList(list);
		order.setPrinttax(true);
		
		double ac = order.calTotalAmount();
		double ex = 5500;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() {
		
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		
		OrderDetail order1 = new OrderDetail(1, new Product("Egg", 2000));
		OrderDetail order2 = new OrderDetail(1, new Product("Fish", 3000));
		list.add(order1);
		list.add(order2);
		
		order.setList(list);
		order.setPrinttax(false);
		
		double ac = order.calTotalAmount();
		double ex = 5000;
		
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() {
		
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		
		OrderDetail order1 = new OrderDetail(2, new Product("Egg", 2000));
		OrderDetail order2 = new OrderDetail(1, new Product("Fish", 3000));
		list.add(order1);
		list.add(order2);
		
		order.setList(list);
		order.setPrinttax(true);
		
		double ac = order.calTotalAmount();
		double ex = 7700;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		
		OrderDetail order1 = new OrderDetail(2, new Product("Egg", 2000));
		OrderDetail order2 = new OrderDetail(1, new Product("Fish", 3000));
		list.add(order1);
		list.add(order2);
		
		order.setList(list);
		order.setPrinttax(false);
		
		double ac = order.calTotalAmount();
		double ex = 7000;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		
		OrderDetail order1 = new OrderDetail(1, new Product("Egg", 2000));
		OrderDetail order2 = new OrderDetail(1, new Product("Fish", 3000));
		list.add(order1);
		list.add(order2);
		
		order.setList(list);
		order.setPrinttax(true);
		
		double ac = order.calTotalAmount();
		double ex = 500;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		
		OrderDetail order1 = new OrderDetail(1, new Product("Egg", 2000));
		OrderDetail order2 = new OrderDetail(1, new Product("Fish", 3000));
		list.add(order1);
		list.add(order2);
		
		order.setList(list);
		order.setPrinttax(false);
		
		double ac = order.calTotalAmount();
		double ex = 15000;
		
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		
		OrderDetail order1 = new OrderDetail(2, new Product("Egg", 2000));
		OrderDetail order2 = new OrderDetail(1, new Product("Fish", 3000));
		list.add(order1);
		list.add(order2);
		
		order.setList(list);
		order.setPrinttax(true);
		
		double ac = order.calTotalAmount();
		double ex = 72700;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		
		OrderDetail order1 = new OrderDetail(2, new Product("Egg", 2000));
		OrderDetail order2 = new OrderDetail(1, new Product("Fish", 3000));
		list.add(order1);
		list.add(order2);
		
		order.setList(list);
		order.setPrinttax(false);
		
		double ac = order.calTotalAmount();
		double ex = 71000;
		
		assertNotEquals(ex, ac, 0);
	}
	
}

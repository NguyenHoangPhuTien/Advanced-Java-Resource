package TestPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Code.FinalGrade;
import Code.*;

/*
 * Author : Nguyen Hoang Phu Tien
 * version : 1.0
 * Date : 6/9/2016
 * Test for calculate total mark of final grade
 */
public class FinalGradeTestCase {

	FinalGrade finalGrade = new FinalGrade();
	
	@Test
	public void test1() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(8, 8);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 8.6;
		
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(7, 7);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 7.9;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(5, 5);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 6.5;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(8, 5);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 7.7;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(8, 9);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 8.9;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(8, 8);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 8.16;
		
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(7, 7);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 7.5;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(5, 5);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 6.2;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(8, 5);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 7.0;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkExam markExam = new MarkExam(8, 9);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 18.9;
		
		assertNotEquals(ex, ac, 0);
	}
}

package EmployeeSalaryUnitAndTestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CollectionEmployeeUnitTest.class, EmployeeSalaryTaxTest.class, TradeEmployeeUnitTest.class })
public class TestSuite {

}

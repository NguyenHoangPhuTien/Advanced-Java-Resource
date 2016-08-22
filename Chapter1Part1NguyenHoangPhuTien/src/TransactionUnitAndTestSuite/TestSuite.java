package TransactionUnitAndTestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TracsactionMoneyUnitTest.class, TransactionGoldUnitTest.class,
		TransactionTestSuite.class })
public class TestSuite {

}

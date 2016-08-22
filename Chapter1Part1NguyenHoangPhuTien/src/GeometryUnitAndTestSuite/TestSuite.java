package GeometryUnitAndTestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AreaCircleTest.class, AreaRectangleTest.class, Distance2CoordinateTest.class, PerimeteCircleTest.class,
		PerimeterRectangleTest.class })
public class TestSuite {

}

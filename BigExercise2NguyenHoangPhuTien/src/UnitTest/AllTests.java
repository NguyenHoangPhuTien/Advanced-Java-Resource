package UnitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QueryAllCD.class, QueryCDByName.class, QueryCDByNumberSongDistance.class, QueryCDByNumberSongs.class,
		QueryCDByPrice.class, QueryCDByPriceDistance.class, QueryCDBySinger.class })
public class AllTests {

}

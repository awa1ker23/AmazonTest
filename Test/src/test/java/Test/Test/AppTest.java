package Test.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
//    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
//        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
		return null;
//        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Assert.assertTrue(true);
    }
}

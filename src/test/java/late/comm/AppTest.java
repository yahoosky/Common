package late.comm;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import late.comm.excp.BaseErrCodeConstants;
import late.comm.excp.BaseException;
import late.comm.excp.BaseErrorManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     *  
     * @methodName testExcp
     * @author chijingjia
     * @createTime 2017年12月4日 上午9:09:52
     * @version v1.0
     */
    @org.junit.Test
    public void testExcp(){
    	try {
			BaseErrorManager.throwMessage(BaseErrCodeConstants.USER_DEFINED_MSG, "haha", "ces");
		} catch (BaseException e) {
			e.printStackTrace();
		}
    }
}

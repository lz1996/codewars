/**  
* <p>Title: DiamondTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月6日  
* @version 1.0  
*/  
package codesWar;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 李铸
 *
 */
public class DiamondTest {

	 @Test
	    public void testDiamond3() {
	      StringBuffer expected = new StringBuffer();
	      expected.append(" *\n");
	      expected.append("***\n");
	      expected.append(" *\n");
	      
	      assertEquals(expected.toString(), Diamond.print(3));
	    }
	    
	    @Test
	    public void testDiamond5() {
	      StringBuffer expected = new StringBuffer();
	      expected.append("  *\n");
	      expected.append(" ***\n");
	      expected.append("*****\n");
	      expected.append(" ***\n");
	      expected.append("  *\n");
	      
	      assertEquals(expected.toString(), Diamond.print(5));
	    }    
}

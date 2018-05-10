/**  
* <p>Title: SetBitsTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月10日  
* @version 1.0  
*/  
package codesWar;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 李铸
 *
 */
public class SetBitsTest {
        SetBits sb = new SetBits();
	 @Test
	    public void sampleTests() {
	      assertEquals(sb.eliminateUnsetBits("11010101010101"), 255);
	      assertEquals(sb.eliminateUnsetBits("111"), 7);
	      assertEquals(sb.eliminateUnsetBits("1000000"), 1);
	    }

	
}

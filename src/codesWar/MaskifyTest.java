/**  
* <p>Title: MaskifyTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年4月24日  
* @version 1.0  
*/  
package codesWar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author 李铸
 *
 */
public class MaskifyTest {

	
	@Test
	public void test() {
		assertEquals("3421", Maskify.maskify("3421"));
	}

}

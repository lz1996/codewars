/**  
* <p>Title: BinaryArrayToNumberTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月6日  
* @version 1.0  
*/  
package codesWar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * @author 李铸
 *
 */
public class BinaryArrayToNumberTest {

	@Test
	public void test() {
		  assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
	      assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
	      assertEquals(6, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
	      assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
	}

}

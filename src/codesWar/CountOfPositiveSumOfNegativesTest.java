/**  
* <p>Title: CountOfPositiveSumOfNegativesTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月11日  
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
public class CountOfPositiveSumOfNegativesTest {

	
	 @Test
	    public void countPositivesSumNegatives_BasicTest() {
	      int[] expectedResult = new int[] {10, -65};
	      assertArrayEquals(expectedResult, CountOfPositiveSumOfNegatives.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
	    }
	    
	    @Test
	    public void countPositivesSumNegatives_InputWithZeroes() {
	      int[] expectedResult = new int[] {8, -50};
	      assertArrayEquals(expectedResult, CountOfPositiveSumOfNegatives.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
	    }

}

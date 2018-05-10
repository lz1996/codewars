/**  
* <p>Title: SolutionTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月9日  
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
public class SolutionTest {

	/**
	 * @throws java.lang.Exception
	 */
	 @Test
	    public void test1() {
	        int[] array = new int[] {1, 2,3,4,5,6,7,8,9};
	        assertEquals("yes, ascending", Solution.isSortedAndHow(array));
	    }
	    
	    @Test
	    public void test2() {
	        int[] array = new int[] {15, 7, 3, -8,-9,-10};
	        assertEquals("yes, descending", Solution.isSortedAndHow(array));
	    }
	    
	    @Test
	    public void test3() {
	        int[] array = new int[] {4, 2, 30};
	        assertEquals("no", Solution.isSortedAndHow(array));
	    }

}

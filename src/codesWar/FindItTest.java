/**  
* <p>Title: FindItTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月15日  
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
public class FindItTest {
    FindIt bd = new FindIt();

	
	@Test
    public void testCase0() {
        assertEquals(3,bd.findIt("99X=1(mod 8)"));
    }
	@Test
    public void testCase1() {
        assertEquals(2,bd.findIt("72X=1(mod 11)"));
    }
	@Test
    public void testCase2() {
        assertEquals(4,bd.findIt("88X=1(mod 9)"));
    }
	@Test
    public void testCase3() {
        assertEquals(2,bd.findIt("28X=1(mod 5)"));
    }
	@Test
    public void testCase4() {
        assertEquals(1,bd.findIt("493X=1(mod 3)"));
        assertEquals(1,bd.findIt("6336X=1(mod 5)"));
        assertEquals(4,bd.findIt("16X=1(mod 9)"));
        assertEquals(-1,bd.findIt("145X=1(mod 10)"));
    }
	@Test
    public void testCase5() {
        assertEquals(5,bd.findIt("1X=5(mod 8)"));
    }
	@Test
    public void testCase6() {
        assertEquals(2,bd.findIt("4X=2(mod 3)"));
    }
	@Test
    public void testCase7() {
        assertEquals(4,bd.findIt("1X=4(mod 6)"));
    }
}

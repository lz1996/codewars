/**  
* <p>Title: DontGiveMeFiveTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月13日  
* @version 1.0  
*/  
package codesWar;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 李铸
 *
 */
public class DontGiveMeFiveTest {
	@Test
    public void test() {
		 assertEquals(8, DontGiveMeFive.dontGiveMeFive(1,9));
    }
	@Test
	public void test1(){
	      assertEquals(12, DontGiveMeFive.dontGiveMeFive(4,17));
	}
	@Test
	public void test2(){
		 assertEquals(14, DontGiveMeFive.dontGiveMeFive(-15,0));
	}


}

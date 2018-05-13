/**  
* <p>Title: PersistTest.java</p>  
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
public class PersistTest {

	@Test
	public void BasicTests0() {
		assertEquals(3, Persist.persistence(39));
	}
	@Test
	public void BasicTests1() {
		assertEquals(0, Persist.persistence(4));
	}
	@Test
	public void BasicTests2() {
		assertEquals(2, Persist.persistence(25));
	}
	@Test
	public void BasicTests3() {
		assertEquals(4, Persist.persistence(999));
	}
}

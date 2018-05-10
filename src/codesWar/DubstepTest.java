/**  
* <p>Title: DubstepTest.java</p>  
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
public class DubstepTest {

	  @Test
	    public void Test1() {
		assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
	    }
	    @Test
	    public void Test2(){
		assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
	    }

}

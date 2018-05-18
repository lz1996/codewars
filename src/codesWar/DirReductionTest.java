/**  
* <p>Title: DirReductionTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月16日  
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
public class DirReductionTest {

	@SuppressWarnings("deprecation")
	@Test
	  public void testSimpleDirReduc0() throws Exception {
	    assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
	        new String[]{"WEST"},
	        DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
	  }
	@SuppressWarnings("deprecation")
	@Test
	  public void testSimpleDirReduc1() throws Exception {
	    assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
	        new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
	        DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
	  }
	@SuppressWarnings("deprecation")
	@Test
	  public void testSimpleDirReduc2() throws Exception {
	    assertEquals("\"NORTH\", \"SOUTH\", \"WEST\",\"EAST\"",
	        new String[]{},
	        DirReduction.dirReduc(new String[]{"NORTH",  "SOUTH", "WEST", "EAST"}));
	  }
}

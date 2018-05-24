/**  
* <p>Title: HighestScoringWordTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月24日  
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
public class HighestScoringWordTest {

	 @Test
	    public void sampleTests0() {
	        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
	    }
	@Test
	    public void sampleTests1() {
	        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
	    }
	  @Test
	    public void sampleTests2() {
	        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
	    }

}

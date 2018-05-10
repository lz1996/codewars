/**  
* <p>Title: SmileFaces.java</p>  
* <p>Description: 
* Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
-A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
-Every smiling face must have a smiling mouth that should be marked with either ) or D.
No additional characters are allowed except for those mentioned.
Valid smiley face examples:
:) :D ;-D :~)
Invalid smiley faces:
;( :> :} :] 

* </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月10日  
* @version 1.0  
*/  
package codesWar;

import java.util.List;

/**
 * @author 李铸
 *
 */
public class SmileFaces {
	public static int countSmileys(List<String> arr) {
		/*int count=0;
		for(int i=0;i<arr.size();i++){
			 String str=arr.get(i);
		     if(str.matches("(:|;)(-|~)?(\\)|D)")){
		    	 count++;
		     }
		}
		return count;*/
	      return (int) arr.stream().filter(s -> s.matches("^[:;][-~]?[)D]$")).count();
	  }
}

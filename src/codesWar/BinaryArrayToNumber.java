/**  
* <p>Title: BinaryArrayToNumber.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月6日  
* @version 1.0  
*/  
package codesWar;

import java.util.List;

/**
 * @author 李铸
 *
 */
public class BinaryArrayToNumber {
	 public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		/*int length=binary.size();
		int result=0;
		if(length==0)
			return 0;
		for(int i=length;i!=0;i--){
			if(binary.get(i-1)==1){
				result+=(int) Math.pow(2, length-i);
			}
		}
		return result;*/
	        return binary.stream().reduce((x, y) -> x * 2 + y).get();
	    }

}

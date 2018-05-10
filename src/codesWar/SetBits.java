/**  
* <p>Title: SetBits.java</p>  
* <p>Description: 
* You are given a string representing a number in binary. Your task is to delete all the unset bits in this string and return the corresponding number (after keeping only the '1's).
example:
* eliminate_unset_bits("11010101010101") ->  255 (= 11111111)
* eliminate_unset_bits("111") ->  7
* eliminate_unset_bits("1000000") -> 1
* eliminate_unset_bits("000") -> 0
* </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月10日  
* @version 1.0  
*/  
package codesWar;

/**
 * @author 李铸
 *
 */
public class SetBits {
	public long eliminateUnsetBits(String number) {
	       long l=0;
	       String  str=number.replaceAll("0", "").trim();
	       l=(long) Math.pow(2,str.length())-1;
		   return l;
	     }

}

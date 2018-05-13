/**  
* <p>Title: Persist.java</p>  
* <p>Description: 
* Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number
* </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月13日  
* @version 1.0  
*/  
package codesWar;

/**
 * @author 李铸
 *
 */
public class Persist {
	/*public static int persistence(long n) {
		int result=0;
		while(n>9){
			n=getPersistence(n);
			result++;
		}
		return result;
	}
    
	private static int getPersistence(long n){
		int result=1;
		String sn=""+n;
			for(int i=0;i<sn.length();i++){
				String str=sn.charAt(i)+"";
				int x=Integer.valueOf(str);
				result*=x;
		 }
		return result;
	}*/
	public static int persistence(long n) {
	    long m = 1, r = n;

	    if (r / 10 == 0)
	      return 0;

	    for (r = n; r != 0; r /= 10)
	      m *= r % 10;

	    return persistence(m) + 1;
	    
	  }
}

/**  
* <p>Title: Maskify.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年4月24日  
* @version 1.0  
*/  
package codesWar;

/**
 * @author 李铸
 *
 */
public class Maskify {
	 public static String maskify(String str) {
		 String s=str;
		 int length=s.length();
		 if(length>4){
			 s=s.substring(length-4);
		 }
		 for(int i=0;i<length-4;i++)
			 s="#"+s;
		 return  s;
	    }

}

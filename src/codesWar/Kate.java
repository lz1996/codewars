/**  
* <p>Title: Kate.java</p>  
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
class Kata {
	  public static String getMiddle(String word) {
	    //Code goes here!
	    String a = "";
	    int length=word.length();
	    if(length%2==1){
		  a=word.substring(length/2,length/2+1);
	    }else if(length%2==0){
	      a=word.substring(length/2-1,length/2+1);
	    }
	    return a;
	  }
	}
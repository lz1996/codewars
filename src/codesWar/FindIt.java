/**  
* <p>Title: FindIt.java</p>  
* <p>Description: Given String s in the form of equation.
Your task is to parse the s string and find the "X" value from string.

Example:
For s = "99X=1(mod 8)", the output should be
findIt(s) = 3.</p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月15日  
* @version 1.0  
*/  
package codesWar;


/**
 * @author 李铸
 *
 */
public class FindIt {
	 public int findIt(String s) {
	      int result=-1;
	      int a=Integer.valueOf(s.substring(0, s.indexOf("X")));
	      int b=Integer.valueOf(s.substring(s.indexOf("=")+1,s.indexOf("(")));
	      int c=Integer.valueOf(s.substring(s.indexOf(" ")+1,s.indexOf(")")));
	      for(int i=0;i<a;i++){//
	    	  int z=c*i+b;
	    	  if(z%a==0){
	    		  result= z/a;
	    		  break;
	    	  }
	      }
	      return result;
	  
		/* int k = Integer.parseInt((s.substring(0,s.indexOf('X'))));
		    int r = Integer.parseInt((s.substring(s.indexOf('=')+1,s.indexOf('('))));
		    int m = Integer.parseInt((s.substring(s.indexOf("mod")+3,s.indexOf(')'))).trim());
		    k=k%m;
		    for (int i=1;i<=m;i++)
		        if ((k*i)%m==r)return i;
		    return -1;  */
		    
		 } 
}

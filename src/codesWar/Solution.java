/**  
* <p>Title: Solution.java</p>  
* <p>Description: 
* Complete the method which accepts an array of integers, and returns one of the following:
"yes, ascending" - if the numbers in the array are sorted in an ascending order
"yes, descending" - if the numbers in the array are sorted in a descending order
"no" - otherwise
You can assume the array will always be valid, and there will always be one correct answer.</p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月9日  
* @version 1.0  
*/  
package codesWar;

/**
 * @author 李铸
 *
 */
public class Solution {
	 public static String isSortedAndHow(int[] array) {
		 /* int length=array.length;
		  int x=array[0],y;
		  boolean bool1=array[0]<array[1];//记录上一组的x<y
		  boolean bool2=false;//记录本一组的x<y

		  for(int i=0;i+1<length;i++){
			  y=array[i+1];
			  if(x>y){
				  bool2=false;
			  }else if(x<y){
				  bool2=true;
			  }else if(x==y){
				  bool2=bool1;
			  }
			  if(bool1==bool2){
				  bool1=bool2;
				  x=y;
			  }else{
                break;
			  }
		  }
		  if(bool1==bool2&&bool1){
			  return "yes, ascending";
		  }else if(bool1==bool2&&!bool1){
			  return "yes, descending";
		  }
	      return "no";*/
		    boolean desc = false;
		    boolean asc = false;
		    for(int i = 1; i < array.length; i++) {
		      if(array[i] > array[i-1]) asc = true;
		      if(array[i] < array[i-1]) desc = true;
		    }
		    if(asc && !desc) return "yes, ascending";
		    if(desc && !asc) return "yes, descending";
		    return "no";
	  }

}

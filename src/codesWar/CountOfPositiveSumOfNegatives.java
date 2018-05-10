/**  
* <p>Title: CountOfPositiveSumOfNegatives.java</p>  
* <p>Description: Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.</p>  
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
public class CountOfPositiveSumOfNegatives {
	 public static int[] countPositivesSumNegatives(int[] input){
		    if(input==null||input.length==0){
		      return new int[0];
		    }
		    int [] result=new int[2];
				int count=0;
				int sum=0;
				for(int i=0;i<input.length;i++){
					if(input[i]>0){
						count++;
					}else{
						sum+=input[i];
					}
				}
				result[0]=count;
				result[1]=sum;
				return result;
		    }

}

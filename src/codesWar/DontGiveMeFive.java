/**  
* <p>Title: DontGiveMeFive.java</p>  
* <p>Description: </p>  
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
public class DontGiveMeFive {
	public static int dontGiveMeFive(int start, int end)
	  {
	      int s=0;
		    for(int i=start;i<end+1;i++){
		       /* if(i%5==0&&((i/5)%2==1||(i/5)%2==-1)){
		          s=s+1;
		        }*/
		    	if(String.valueOf(i).contains("5")){
			          s=s+1;
			      }
		    }
		    return (end+1)-start-s;
	  }

}

/**  
* <p>Title: HighestScoringWord.java</p>  
* <p>Description:
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to it's position in the alphabet: a = 1, b = 2, c = 3 etc.
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
</p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月24日  
* @version 1.0  
*/  
package codesWar;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 李铸
 *
 */
public class HighestScoringWord {
	/* public static String high(String s) {
		    s=s+" ";
		    char [] schar=s.toCharArray();
		    String astr="";//上一个
		    String bstr="";//当前
		    int ascoring=0;//上一个
		    int bscoring=0;//当前
		    for ( char c : schar) {
		    	if(c!=' '){
		    		bstr+=c;
		    		bscoring=bscoring+c-96;
		    	}else if(ascoring<bscoring){
		    		ascoring=bscoring;
		    		bscoring=0;
		    		astr=bstr;
		    		bstr="";
		    	}else{
		    		bscoring=0;
		    		bstr="";
		    	}
			}
		    return astr;
		  }*/
	public static String high(String s) {
	    return Arrays.stream(s.split(" ")).max(Comparator.comparingInt(
	                        a -> a.chars().map(i -> i - 96).sum())).get(); 
	  }
	/* public static String high(String s) {
		    
		    String winner = "";
		    int highScore = 0;
		    
		    for (String word : s.split(" ")) {
		        int score = 0;
		        for (char c : word.toCharArray()) {
		          score += c - 'a' + 1;
		        }
		        if (score > highScore) {          
		          winner = word;
		          highScore = score;
		        }
		    }
		    
		    return winner;
		  }*/

}

/**  
* <p>Title: DirReduction.java</p>  
* <p>Description: 
* Task
Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).
The Haskell version takes a list of directions with data Direction = North | East | West | South. The Clojure version returns nil when the path is reduced to nothing. The Rust version takes a slice of enum Direction {NORTH, SOUTH, EAST, WEST}.
Examples
dirReduc(@[@"NORTH", @"SOUTH", @"SOUTH", @"EAST", @"WEST", @"NORTH", @"WEST"]); // => @[@"WEST"]
dirReduc(@[@"NORTH", @"SOUTH", @"SOUTH", @"EAST", @"WEST", @"NORTH"]); // => @[]
* </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月16日  
* @version 1.0  
*/  
package codesWar;

import java.util.Stack;

/**
 * @author 李铸
 *
 */
public class DirReduction {
	/* public static String[] dirReduc(String[] arr) {
			 String str=Arrays.toString(arr).replaceAll(" ", "").replaceAll(",", "");
		      while(str.contains("NORTHSOUTH")||str.contains("SOUTHNORTH")||str.contains("EASTWEST")||str.contains("WESTEAST")){
		    	  str=str.replaceAll("NORTHSOUTH", "").trim(); str=str.replaceAll("SOUTHNORTH", "").trim();
			      str=str.replaceAll("EASTWEST", "").trim(); str=str.replaceAll("WESTEAST", "").trim();
		      }
	          str=str.replaceAll("NORTH", ",NORTH").replaceAll("SOUTH", ",SOUTH").replaceAll("EAST", ",EAST").replaceAll("WEST", ",WEST");
		      str=str.substring(1,str.length()-1);
		      if(str.startsWith(",")){
		    	  str=str.substring(1);
		      }
	         String[] array = str.split(",");  
	         if(!array[0].equals(""))
		         return array;
		     return new String[] {};
		    }*/
	    
	public static String[] dirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
}
}
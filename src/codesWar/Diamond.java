/**  
* <p>Title: Diamond.java</p> 
 
* <p>Description: This kata is to practice simple string output. Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James. Since James doesn't know how to make this happen, he needs your help.
###Task:
You need to return a string that displays a diamond shape on the screen using asterisk ("*") characters. Please see provided test cases for exact output format.
The shape that will be returned from print method resembles a diamond, where the number provided as input represents the number of *’s printed on the middle line. The line above and below will be centered and will have 2 less *’s than the middle line. This reduction by 2 *’s for each line continues until a line with a single * is printed at the top and bottom of the figure.
Return null if input is even number or negative (as it is not possible to print diamond with even number or negative number).
Please see provided test case(s) for examples.
Python Note
Since print is a reserved word in Python, Python students must implement the diamond(n) method instead, and return None for invalid input.
JS Note
JS students, like Python ones, must implement the diamond(n) method, and return null for invalid input.</p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author lizhu  
* @date 2018年5月6日  
* @version 1.0  
*/  
package codesWar;

/**
 * @author 李铸
 *
 */
public class Diamond {
	public static String print(int n) {
		StringBuffer expected = new StringBuffer();
		if(n%2==1){
			int z=1;
			boolean bool=true;
			for(int i=n;i>0;i--){
				for(int x=(n-z)/2;x>0;x--){
					expected.append(" ");
				}
				for(int y=z;y>0;y--){
					expected.append("*");
				}
				if(z==n){
					z=z-2;
					bool=false;
				}else if(bool){
					z=z+2;
				}else{
					z=z-2;
				}
				expected.append("\n");
			}
			return expected.toString();
		}
		return null;
		}
	/*public static void main(String[] args) {
		 StringBuffer expected = new StringBuffer();
	      expected.append("  *\n");
	      expected.append(" ***\n");
	      expected.append("*****\n");
	      expected.append(" ***\n");
	      expected.append("  *\n");
	      System.out.println(expected);
	}*/
}

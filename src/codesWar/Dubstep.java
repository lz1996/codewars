/**  
* <p>Title: Dubstep.java</p>  
* <p>Description: songDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB")
  // =>  WE ARE THE CHAMPIONS MY FRIEND，以WUB分割还原原字符串</p>  
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
public class Dubstep {
	public static String SongDecoder (String song){
		//String str=song.replaceAll("WUB", " ").trim().replaceAll("\\s+", " ");
		String str=song.replaceAll("(WUB)+", " ").trim();
		return str;
	   }

}
